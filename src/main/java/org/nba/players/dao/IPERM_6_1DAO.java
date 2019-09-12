package org.nba.players.dao;

import java.util.List;

import org.nba.players.entity.PERM_6_1;
import org.nba.players.model.PermModel;

public interface IPERM_6_1DAO {
	List<PermModel> getAllPerm();
	void save(PERM_6_1 perm61);
}
