package com.devandrade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devandrade.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
