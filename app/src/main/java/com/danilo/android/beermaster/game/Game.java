package com.example.android.beermaster.game;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.beermaster.R;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game);

        ImageView deckOfCards = (ImageView) findViewById(R.id.deck_of_cards);
        deckOfCards.setImageResource(R.drawable.ace_clubs);
    }
}
