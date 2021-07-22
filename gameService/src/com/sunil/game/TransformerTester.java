package com.sunil.game;

import com.sunil.game.constants.CharacterType;
import com.sunil.game.dto.TransformerDTO;
import com.sunil.game.service.TransformerService;
import com.sunil.game.service.TransformerServiceImpl;

public class TransformerTester {
	
	public static void main(String[] args) {
		
		TransformerDTO dto = new TransformerDTO("Sunil","Chikmagalur",CharacterType.SMILING,"Sometimes","abcdefg","gsfvehk","khhgdgdg");
		
		TransformerService service = new TransformerServiceImpl();
		String save = service.validateAndSave(dto);
		System.out.println(save);
		
	}
	
	

}
