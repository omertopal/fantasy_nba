package org.nba.players.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="GAME_DATE_ROSTERS_EQ")
public class GameDateRostersEq implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GAME_DATE_ROSTERS_EQ_SEQ")
	@SequenceGenerator(name="GAME_DATE_ROSTERS_EQ_SEQ", sequenceName="GAME_DATE_ROSTERS_EQ_SEQ", allocationSize=1)
	@Column(name="id")
    private int id;
	
	@ManyToOne(cascade=CascadeType.PERSIST, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="GAME_DATE_ROSTER_ID", referencedColumnName="id", nullable=false, insertable = true)
	private GameDateRosters gameDateRosterId;
	
	@Column(name="EQUIVALENT_PERM_ID")
	private int equivalentPermId;
	
	@Column(name="pg")
    private int pg;  
	
	@Column(name="sg")
    private int sg;  
	
	@Column(name="sf")
    private int sf;  
	
	@Column(name="pf")
    private int pf;  
	
	@Column(name="c")
    private int c;  
	
	@Column(name="ut")
    private int ut;

	public int getPg() {
		return pg;
	}

	public void setPg(int pg) {
		this.pg = pg;
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

	public int getId() {
		return id;
	}

	public GameDateRosters getGameDateRosterId() {
		return gameDateRosterId;
	}

	public int getEquivalentPermId() {
		return equivalentPermId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setGameDateRosterId(GameDateRosters gameDateRosterId) {
		this.gameDateRosterId = gameDateRosterId;
	}

	public void setEquivalentPermId(int equivalentPermId) {
		this.equivalentPermId = equivalentPermId;
	}

	
	
}
