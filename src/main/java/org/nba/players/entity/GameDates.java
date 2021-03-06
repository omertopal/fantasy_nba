package org.nba.players.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GAME_DATES")
public class GameDates {

	@Id
	private Date gameDate;
	
	@Column(name="GAME_COUNT")
	private int gameCount;
	
	public GameDates(){
		
	}
	public GameDates(Date gameDate){
		this.gameDate = (Date) gameDate.clone();
	}

	public Date getGameDate() {
		return new Date(gameDate.getTime());
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = (Date) gameDate.clone();
	}
	
	public int getGameCount() {
		return gameCount;
	}
	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}
	@Override
	public String toString() {
		return "GameDates [gameDate=" + gameDate.toString() + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameDate == null) ? 0 : gameDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDates other = (GameDates) obj;
		if (gameDate == null) {
			if (other.gameDate != null)
				return false;
		} else if (!gameDate.equals(other.gameDate))
			return false;
		return true;
	}

}
