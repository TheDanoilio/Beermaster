package com.danilo.android.beermaster.game;

import com.danilo.android.beermaster.cards.Card;

import java.util.LinkedList;

public class Player {

    private String name;
    private int color;
    private boolean[] cardsOnHand;





    
    public void setColor(int color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getColor() {
        return color;
    }

    public boolean[] getCardsOnHand() {
        return cardsOnHand;
    }

    public void setCardsOnHand(boolean[] cardsOnHand, int cardId) {
        this.cardsOnHand = cardsOnHand;

    }
}
