package org.nba.players.controller;

import java.util.List;

import org.nba.players.entity.MyPlayers;
import org.nba.players.entity.Player;
import org.nba.players.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("players")
public class PlayerController extends NbaController{
	@Autowired
	private IPlayerService playerService;
	
	@GetMapping("{id}")
	public ResponseEntity<Player> getPlayerById(@PathVariable("id") Integer id) {
		Player player = playerService.getPlayerById(id);
		return new ResponseEntity<Player>(player, HttpStatus.OK);
	}
	@GetMapping("allPlayers")
	public ResponseEntity<List<Player>> getAllPlayers() {
		List<Player> list = playerService.getAllPlayers();
		return new ResponseEntity<List<Player>>(list, HttpStatus.OK);
	}
	
	@GetMapping("myPlayers")
	public ResponseEntity<List<MyPlayers>> getMyPlayers() {
		List<MyPlayers> list = playerService.getMyPlayers();
		return new ResponseEntity<List<MyPlayers>>(list, HttpStatus.OK);
	}
	
	@PostMapping("player")
	public ResponseEntity<Void> addPlayer(@RequestBody Player player, UriComponentsBuilder builder) {
                boolean flag = playerService.addPlayer(player);
                if (flag == false) {
        	    return new ResponseEntity<Void>(HttpStatus.CONFLICT);
                }
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/player/{id}").buildAndExpand(player.getId()).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("player")
	public ResponseEntity<Player> updatePlayer(@RequestBody Player player) {
		playerService.updatePlayer(player);
		return new ResponseEntity<Player>(player, HttpStatus.OK);
	}
	@DeleteMapping("player/{id}")
	public ResponseEntity<Void> deletePlayer(@PathVariable("id") Integer id) {
		playerService.deletePlayer(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}