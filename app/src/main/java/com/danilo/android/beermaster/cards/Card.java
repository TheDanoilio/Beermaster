package com.danilo.android.beermaster.cards;


public class Card {

    private int id;
    private String description;

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
