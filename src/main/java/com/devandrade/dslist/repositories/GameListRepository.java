package com.devandrade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devandrade.dslist.entities.Game;
import com.devandrade.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
