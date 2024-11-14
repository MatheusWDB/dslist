package com.mwdb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwdb.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
