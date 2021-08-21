package com.danilo.android.beermaster.game;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.danilo.android.beermaster.R;
import com.danilo.android.beermaster.cards.Card;
import com.danilo.android.beermaster.cards.Deck;

import java.util.ArrayList;
import java.util.Collections;


public class Game extends AppCompatActivity {

    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private Deck deck = new Deck();
    public Button nextCardButton;
    public ImageView deckView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
        shuffleDeck();

        nextCardButton = (Button) findViewById(R.id.button_next_card);
        deckView = (ImageView) findViewById(R.id.deck_of_cards);
        deckView.setImageResource(R.drawable.card_back);

        nextCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNextCard(deckView);
            }
        });
    }


    public void showNextCard(ImageView view){

        if (deckOfCards.size() == 0){
            //view.setImageResource(R.drawable.game_over);

            //todo avaliar tipo de carta por aqui (8, K, Q, A)
            Intent endingIntent = new Intent(view.getContext(), Ending.class);
            startActivityForResult(endingIntent, 0);
        }else {
            view.setImageResource(deckOfCards.get(0).getId());
            deckOfCards.remove(0);
        }
    }

    public void shuffleDeck(){
        deckOfCards = deck.createDeck();/*
        Collections.shuffle(deckOfCards);*/
        System.out.println("TÁ AQUI PORRA - for debugging purposes");
        for (int i = 0; i<deckOfCards.size();i++){
            System.out.println(deckOfCards.get(i).getDescription());
        }

    }

    public void checkForSimilarCard(int id){

    }

    @Override
    public void onBackPressed(){
        if(deckOfCards.size()==2){
            finish();
            return;
        }
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("A sair do jogo...")
                .setMessage("Sair? O jogo será perdido.")
                .setPositiveButton("Fek it", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                }).setNegativeButton("Nope", null)
                .show();
    }
}
