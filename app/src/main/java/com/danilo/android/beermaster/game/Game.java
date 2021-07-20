package com.danilo.android.beermaster.game;

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

//todo menu popup a dizer o que falta sair/já saiu
//todo Adicionar um botão para retirar carta aleatória com possibilidade de penalty?
//todo criar botões para pedir : next card for "playerName"
//todo criar view para dizer as cartas que estão com players(8, k, etc)

public class Game extends AppCompatActivity {

    private ArrayList<Card> deckOfCards = new ArrayList<>();
    private Deck deck= new Deck();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_game);
        shuffleDeck();

        Button nextCardButton = (Button) findViewById(R.id.button_next_card);
        ImageView deckOfCards = (ImageView) findViewById(R.id.deck_of_cards);
        deckOfCards.setImageResource(R.drawable.card_back);

        nextCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showNextCard(deckOfCards);
            }
        });
    }




    public int getNextCardId(){
        //todo ir buscar a carta correta ao deck

        return 1;
    }
    // todo criar botão para passar para a próxima carta?

    //todo criar descrição para quando a carta volta
    // (ou botão para a descrição?)
    public void showNextCard(ImageView view){

        if (deckOfCards.size() == 0){
            //todo alterar para deixar de ficar clicável ou assim
            // assim que o deck fique vazio
            view.setImageResource(R.drawable.game_over);
            //Alterar para dois botões - new game e main menu?
            Intent myIntent = new Intent(view.getContext(), Game.class);
            startActivityForResult(myIntent, 0);
        }else {
            view.setImageResource(deckOfCards.get(0).getId());
            deckOfCards.remove(0);
        }
    }

    public void shuffleDeck(){
        deckOfCards = deck.createDeck();
        Collections.shuffle(deckOfCards);
        System.out.println("TÁ AQUI PORRA - for debugging purposes");
        for (int i = 0; i<deckOfCards.size();i++){
            System.out.println(deckOfCards.get(i).getDescription());
        }

    }
    //todo método para verificar se há cartas iguais na mão de alguém
    public void checkForSimilarCard(int id){

    }
}
