package com.sunil.game;

import com.sunil.game.constants.CharacterType;
import com.sunil.game.dto.TransformerDTO;
import com.sunil.game.service.TransformerService;
import com.sunil.game.service.TransformerServiceImpl;

public class TransformerTester {
	
	public static void main(String[] args) {
		
		TransformerDTO dto = new TransformerDTO("Sunil","Chi",CharacterType.SMILING,"Sometimes","Always Happy","when there is a java class on sunday","fun and playing games");
		
		TransformerService service = new TransformerServiceImpl();
		String save = service.validateAndSave(dto);
		System.out.println(save);
		
	}
	
	

}
