package org.nba.players.model;

public class PlayerModel{
	
	private int id;  
	
	private int order;  
	
	private String team;
	
	private String name;
	
	private Double avgPts;
	
	private int sira;
	
	private int isPG;
		
	private int isSG;
		
	private int isSF;
		
	private int isPF;
		
	private int isC;
	
	public boolean hasPGSkill() {
		return isPG==1;
	}
	
	public boolean hasSGSkill() {
		return isSG==1;
	}
	
	public boolean hasSFSkill() {
		return isSF==1;
	}
	
	public boolean hasPFSkill() {
		return isPF==1;
	}
	
	public boolean hasCSkill() {
		return isC==1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
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
}
