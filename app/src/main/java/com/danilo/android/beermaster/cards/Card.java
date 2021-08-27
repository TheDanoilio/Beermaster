package com.danilo.android.beermaster.cards;


public class Card {

    private int id;
    private int description;

    public Card(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }


}
