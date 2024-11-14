package com.mwdb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mwdb.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
