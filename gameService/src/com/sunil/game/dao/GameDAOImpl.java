package com.sunil.game.dao;

import java.util.Collection;
import java.util.HashSet;

import com.sunil.game.dto.GameDTO;

public class GameDAOImpl implements GameDAO {
	
	private Collection<GameDTO> coll = new HashSet<GameDTO>();

	@Override
	public boolean save(GameDTO gamedto) {
		System.out.println("invoked save method");
		return this.coll.add(gamedto);
	}

}
