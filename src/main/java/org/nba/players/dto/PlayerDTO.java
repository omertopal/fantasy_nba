package org.nba.players.dto;

import java.sql.Date;

public class PlayerDTO {
	
	private int id;
	
	private String team;
	
	private String name;
	
	private Double avgPts;
	
	private int sira;
	
	private int isPG;
	
	private int isSG;
	
	private int isSF;
	
	private int isPF;
	
	private int isC;
	
	private int isPotential;
	
	private int isMy;
	
	private Date injEnd;
	
	private int gamesPlayed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAvgPts() {
		return avgPts;
	}

	public void setAvgPts(Double avgPts) {
		this.avgPts = avgPts;
	}

	public int getSira() {
		return sira;
	}

	public void setSira(int sira) {
		this.sira = sira;
	}

	public int getIsPG() {
		return isPG;
	}

	public void setIsPG(int isPG) {
		this.isPG = isPG;
	}

	public int getIsSG() {
		return isSG;
	}

	public void setIsSG(int isSG) {
		this.isSG = isSG;
	}

	public int getIsSF() {
		return isSF;
	}

	public void setIsSF(int isSF) {
		this.isSF = isSF;
	}

	public int getIsPF() {
		return isPF;
	}

	public void setIsPF(int isPF) {
		this.isPF = isPF;
	}

	public int getIsC() {
		return isC;
	}

	public void setIsC(int isC) {
		this.isC = isC;
	}

	public int getIsPotential() {
		return isPotential;
	}

	public void setIsPotential(int isPotential) {
		this.isPotential = isPotential;
	}

	public int getIsMy() {
		return isMy;
	}

	public void setIsMy(int isMy) {
		this.isMy = isMy;
	}

	public Date getInjEnd() {
		return injEnd;
	}

	public void setInjEnd(Date injEnd) {
		this.injEnd = injEnd;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
}
