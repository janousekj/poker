package com.company.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 2. 2016.
 */
public class Table {
    int pot;
    private List<PokerCard> cardsOnTheTable;
    private int highestBet;

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public List<PokerCard> getCardsOnTheTable() {
        return cardsOnTheTable;
    }

    public void setCardsOnTheTable(List<PokerCard> cardsOnTheTable) {
        this.cardsOnTheTable = cardsOnTheTable;
    }

    public int getHighestBet() {
        return highestBet;
    }

    public void setHighestBet(int highestBet) {
        this.highestBet = highestBet;
    }

    public Table() {
        this.pot = 0;
        this.cardsOnTheTable = new ArrayList<>();
        this.highestBet = 0;
    }
}
