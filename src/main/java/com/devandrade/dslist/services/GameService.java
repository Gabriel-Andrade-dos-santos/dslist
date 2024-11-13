package com.devandrade.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;//Component register in spring
import org.springframework.transaction.annotation.Transactional;

import com.devandrade.dslist.dto.GameDTO;
import com.devandrade.dslist.dto.GameMinDTO;
import com.devandrade.dslist.entities.Game;
import com.devandrade.dslist.repositories.GameRepository;

@Service //Component register in spring
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
