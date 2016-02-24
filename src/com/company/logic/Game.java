package com.company.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 11.02.2016.
 */
public class Game {

    Deck deck;
    Table table;
    List<Player> playerList;
    int round;



    public Game() {
        this.deck = new Deck();
        this.table = new Table();
        deck.shuffle();
        this.playerList = new ArrayList<>();
        createPlayer(5000);
        createPlayer(5000);
        this.round = 0;
    }

    public void createPlayer(int chips){
        playerList.add(new Player(chips,deck,table));
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
