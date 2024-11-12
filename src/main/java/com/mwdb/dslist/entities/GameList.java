package com.mwdb.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "tb_game_list")
public class GameList {
    
    @Id
    private Long id;
    private String name;
}
