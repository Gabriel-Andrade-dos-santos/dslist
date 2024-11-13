package com.devandrade.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;//Component register in spring
import org.springframework.transaction.annotation.Transactional;


import com.devandrade.dslist.dto.GameListDTO; 
import com.devandrade.dslist.entities.GameList;
import com.devandrade.dslist.repositories.GameListRepository;

@Service //Component register in spring
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
}
