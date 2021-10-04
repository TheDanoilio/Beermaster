package com.danilo.android.beermaster.game;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.danilo.android.beermaster.MainMenu;
import com.danilo.android.beermaster.R;
import com.danilo.android.beermaster.cards.Card;
import com.danilo.android.beermaster.cards.Deck;
import com.danilo.android.beermaster.cards.CardRule;

import java.util.ArrayList;


public class Game extends AppCompatActivity {

    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private Deck deck = new Deck();
    public Button nextCardButton;
    public Button cardRuleButton;
    public ImageView deckView;
    public Context mContext = this;

    public static Card currentCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
        shuffleDeck();

        nextCardButton = (Button) findViewById(R.id.button_next_card);
        cardRuleButton = (Button) findViewById(R.id.button_card_rules);
        deckView = (ImageView) findViewById(R.id.deck_of_cards);
        deckView.setImageResource(R.drawable.card_back);

        nextCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNextCard(deckView);
            }
        });

        cardRuleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), CardRule.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }


    public void showNextCard(ImageView view){

        if (deckOfCards.size() == 0){

            //todo avaliar tipo de carta por aqui (8, K, Q, A)
            finish();
            Intent endingIntent = new Intent(view.getContext(), Ending.class);
            startActivityForResult(endingIntent, 0);

        }else {
            cardRuleButton.setVisibility(View.VISIBLE);
            cardRuleButton.bringToFront();
            view.setImageResource(deckOfCards.get(0).getId());
            currentCard = deckOfCards.get(0);
            deckOfCards.remove(0);
        }
    }

    public void shuffleDeck(){
        //deckOfCards = deck.createDeck();
        deckOfCards = deck.createDeckShort();
        //Collections.shuffle(deckOfCards);
        System.out.println("TÁ AQUI PORRA - for debugging purposes");
        for (int i = 0; i<deckOfCards.size();i++){
            System.out.println(deckOfCards.get(i).getDescription());
        }

    }

    public void checkForSimilarCard(int id){

    }

    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("A sair do jogo...")
                .setMessage("Sair? O jogo será perdido.")
                .setPositiveButton("Fek it", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //finish();
                        finishAffinity();
                        Intent intent = new Intent(mContext, MainMenu.class);
                        startActivity(intent);
                    }

                }).setNegativeButton("Nope", null)
                .show();
    }

    public static Card getCurrentCardId(){
        return currentCard;
    }

}
