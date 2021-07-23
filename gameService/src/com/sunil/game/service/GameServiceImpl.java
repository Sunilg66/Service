package com.sunil.game.service;

import com.sunil.game.dao.GameDAO;
import com.sunil.game.dao.GameDAOImpl;
import com.sunil.game.dto.GameDTO;

public class GameServiceImpl implements GameService {
	
	private GameDAO dao = new GameDAOImpl();

	@Override
	public String validateAndSave(GameDTO dto) {

		System.out.println("invoking validateand save  : " + dto);
		boolean nameValid = false;
		boolean versionValid = false;
		if (dto != null) {
			System.out.println("dto is not null start validate");
			String name = dto.getName();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 10) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is not valid");
			    nameValid = false;
			}

			String version = dto.getVersion();
			if (version != null && version.length() > 1 && version.length() < 50) {
				System.out.println("version is valid");
				versionValid = true;
			} else {
				System.out.println("version is not valid");
				versionValid = false;
			}
			if (nameValid && versionValid) {
				System.out.println("data is valid");
				dao.save(dto);
				return "Success";
			}
			return "fail";
		}
		System.out.println("dto is null ,cannot pass to dao");
		return "fail";
	}

}
