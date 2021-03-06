package org.nba.players.model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public class GameDateRosterModel {	
	
	private Date gameDate;
	
    private int pg;  
	
    private int sg;  
	
    private int sf;  
	
    private int pf;  
	
    private int c;  
	
    private int ut;
    
    Timestamp runTime;
    
    private PlayerModel pgModel;  
	
    private PlayerModel sgModel;  
	
    private PlayerModel sfModel;  
	
    private PlayerModel pfModel;  
	
    private PlayerModel cModel;  
	
    private PlayerModel utModel;
    
    private int permId;
    
    private int calcId;
    
    private int activePlayersCount;
    
    private Double totalPts;    
    
    private List<GameDateRosterEqModel> equivalentPermutations;

	public Date getGameDate() {
		return new Date(gameDate.getTime());
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = (Date) gameDate.clone();
	}

	public int getActivePlayersCount() {
		return activePlayersCount;
	}

	public void setActivePlayersCount(int activePlayersCount) {
		this.activePlayersCount = activePlayersCount;
	}

	public int getPg() {
		return pg;
	}

	public void setPg(int pg) {
		this.pg = pg;
	}

	public Timestamp getRunTime() {
		return runTime;
	}

	public void setRunTime(Timestamp runTime) {
		this.runTime = runTime;
	}

	public int getSg() {
		return sg;
	}

	public void setSg(int sg) {
		this.sg = sg;
	}

	public int getSf() {
		return sf;
	}

	public void setSf(int sf) {
		this.sf = sf;
	}

	public int getPf() {
		return pf;
	}

	public void setPf(int pf) {
		this.pf = pf;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getUt() {
		return ut;
	}

	public void setUt(int ut) {
		this.ut = ut;
	}

	public int getPermId() {
		return permId;
	}

	public void setPermId(int permId) {
		this.permId = permId;
	}

	public int getCalcId() {
		return calcId;
	}

	public void setCalcId(int calcId) {
		this.calcId = calcId;
	}

	public Double getTotalPts() {
		return totalPts;
	}

	public void setTotalPts(Double totalPts) {
		this.totalPts = totalPts;
	}

	public List<GameDateRosterEqModel> getEquivalentPermutations() {
		return equivalentPermutations;
	}

	public void setEquivalentPermutations(List<GameDateRosterEqModel> equivalentPermutations) {
		this.equivalentPermutations = equivalentPermutations;
	}

	public PlayerModel getPgModel() {
		return pgModel;
	}

	public void setPgModel(PlayerModel pgModel) {
		this.pgModel = pgModel;
	}

	public PlayerModel getSgModel() {
		return sgModel;
	}

	public void setSgModel(PlayerModel sgModel) {
		this.sgModel = sgModel;
	}

	public PlayerModel getSfModel() {
		return sfModel;
	}

	public void setSfModel(PlayerModel sfModel) {
		this.sfModel = sfModel;
	}

	public PlayerModel getPfModel() {
		return pfModel;
	}

	public void setPfModel(PlayerModel pfModel) {
		this.pfModel = pfModel;
	}

	public PlayerModel getcModel() {
		return cModel;
	}

	public void setcModel(PlayerModel cModel) {
		this.cModel = cModel;
	}

	public PlayerModel getUtModel() {
		return utModel;
	}

	public void setUtModel(PlayerModel utModel) {
		this.utModel = utModel;
	}

	
}
