package com.sunil.game.service;

import com.sunil.game.dao.TransformerDAO;
import com.sunil.game.dao.TransformerDAOImpl;
import com.sunil.game.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {
	
	private TransformerDAO dao = new TransformerDAOImpl();

	@Override
	public String validateAndSave(TransformerDTO dto) {

		System.out.println("invoking validate and save : " + dto);
		boolean validName = false;
		boolean validPlace = false;
		boolean validdata =false;
		
		if (dto != null) {
			System.out.println("dto is not null start validate");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
				System.out.println("name is valid");
				validName = true;
			} else {
				System.out.println("name is not valid");
				validName = false;
			}

			String place = dto.getPlace();
			if (place != null && place.isEmpty() && place.length() >= 4 && place.length() <= 20) {
				System.out.println("place is valid");
				validPlace = true;
			} else {
				System.out.println("place is not valid");
				validPlace = false;
			}

			String happy = dto.getHappy();
			if (happy != null && !happy.isEmpty() && happy.length() >= 4 && happy.length() <= 12) {
				System.out.println("happy data is valid");
				validdata = true;
			} else {
				System.out.println("happy data is not valid");
				validdata = false;
			}

			String sad = dto.getSad();
			if (sad != null && !sad.isEmpty() && sad.length() >= 4 && sad.length() >= 12) {
				System.out.println("sad data is valid");
				validdata = true;
			} else {
				System.out.println("sad data is not valid");
				validdata = false;
			}

			String likeToDo = dto.getLikeToDo();
			if (likeToDo != null && !likeToDo.isEmpty() && likeToDo.length() >= 15 && likeToDo.length() <= 300) {
				System.out.println("likeToDo data is valid");
				validdata = true;
			} else {
				System.out.println("likeToDo data is not valid");
				validdata = false;
			}
			if (validName && validPlace) {
				System.out.println("data is valid");
				dao.validateAndSave(dto);
				return "Success";
			}
			return "fail";
		}
		System.out.println("dto is null, cannot pass to dao");
		return "failed";

	}

}
