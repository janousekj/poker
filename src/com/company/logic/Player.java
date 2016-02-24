package com.company.logic;

import javafx.scene.control.Tab;

import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 2. 2016.
 */
public class Player {
    int chips;
    private Hand hand;
    boolean isDealer = false;
    int myBet;
    boolean isPlaying;
    Table table;

    //private List<PokerCard> cardsOnHand;
//TODO konstruktor ve kterem naplni ruku


    public Player(int chips, Deck deck, Table table) {
        this.hand = new Hand(deck);
        this.chips = chips;
        this.table = table;
        this.myBet = 0;
        this.isPlaying=true;

    }
    public void placeBet(int valueOfBet){
        if (chips>=valueOfBet){
            table.setPot(table.getPot()+valueOfBet);
            chips-=valueOfBet;
            myBet+=valueOfBet;
            if (table.getHighestBet()<valueOfBet){
                table.setHighestBet(valueOfBet);
            }
        }
    }
    public void call(){
        int amountToCall = table.getHighestBet()-myBet;
        if(chips>=amountToCall){
            table.setPot(table.getPot()+amountToCall);
            chips-=amountToCall;
            myBet+=amountToCall;
        }
    }
    public void fold(){
        isPlaying=false;
    }
    public void check(){
        if (myBet==table.getHighestBet());
    }



}