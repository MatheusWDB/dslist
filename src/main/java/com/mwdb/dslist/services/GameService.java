package com.mwdb.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mwdb.dslist.dto.GameMinDTO;
import com.mwdb.dslist.entities.Game;
import com.mwdb.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = this.gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
