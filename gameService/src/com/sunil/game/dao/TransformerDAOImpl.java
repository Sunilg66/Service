package com.sunil.game.dao;

import java.util.Collection;
import java.util.HashSet;

import com.sunil.game.dto.TransformerDTO;

public class TransformerDAOImpl implements TransformerDAO{
	
	private Collection<TransformerDTO> coll = new HashSet<TransformerDTO>();

	@Override
	public String validateAndSave(TransformerDTO dto) {
		System.out.println("invoked validate and save method ");
		
		return "added";
	}

}
