package com.mwdb.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mwdb.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
  
}
