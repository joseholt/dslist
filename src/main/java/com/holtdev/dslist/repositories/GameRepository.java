package com.holtdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.holtdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
