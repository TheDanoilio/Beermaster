package com.danilo.android.beermaster.game;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.danilo.android.beermaster.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//todo linkedlists para os baralhos ? Aqui ou na Card ?
//todo menu popup a dizer o que falta sair/já saiu3
//todo Adicionar um botão para retirar carta aleatória com possibilidade de penalty?

public class Game extends AppCompatActivity {

    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private Card card= new Card(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game);
        shuffleDeck();

        ImageView deckOfCards = (ImageView) findViewById(R.id.deck_of_cards);
        deckOfCards.setImageResource(R.drawable.card_back);
        deckOfCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNextCard(deckOfCards);
            }
        });
    }

    public int getNextCardId(){
        //todo ir buscar a carta correta à linkedlist ou lá o crl
        return 1;
    }
    // todo criar botão para passar para a próxima carta

    //todo criar descrição para quando a carta volta
    // (em conjunto com o botão?)
    public void showNextCard(ImageView view){
        //todo falta mudar a carta e apagá-la do deck

        view.setImageResource(deckOfCards.get(0).getId());
    }

    public void shuffleDeck(){
        deckOfCards = card.createDeck();
        Collections.shuffle(deckOfCards);
    }
}
