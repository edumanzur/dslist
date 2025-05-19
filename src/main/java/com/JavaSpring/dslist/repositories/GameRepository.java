package com.JavaSpring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaSpring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
