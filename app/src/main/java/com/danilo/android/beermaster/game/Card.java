package com.danilo.android.beermaster.game;

import com.danilo.android.beermaster.R;

import java.util.ArrayList;
import java.util.LinkedList;

public class Card {

    private int id;
    private String description;
    public ArrayList<Card> deck = new ArrayList<>();

    //todo fazer um método DECENTE PARA ISTO
    public ArrayList createDeck(){
        Card aceSpades = new Card(R.drawable.ace_black);
        deck.add(aceSpades);
        Card aceClubs = new Card(R.drawable.ace_black);
        deck.add(aceClubs);
        Card aceHearts = new Card(R.drawable.ace_red);
        deck.add(aceHearts);
        Card aceDiamonds = new Card(R.drawable.ace_red);
        deck.add(aceDiamonds);
        Card twoSpades = new Card(R.drawable.two_black);
        deck.add(twoSpades);
        Card twoClubs = new Card(R.drawable.two_black);
        deck.add(twoClubs);
        Card twoHearts = new Card(R.drawable.two_black);
        deck.add(twoHearts);
        Card twoDiamonds = new Card(R.drawable.two_black);
        deck.add(twoDiamonds);

        return deck;
    }

    public Card(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }


}
