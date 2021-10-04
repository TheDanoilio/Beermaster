package com.danilo.android.beermaster.cards;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.danilo.android.beermaster.R;
import com.danilo.android.beermaster.game.Game;

public class CardRule extends AppCompatActivity {

    private ImageView cardView;
    private TextView cardDescription;
    private Button dismissBtn;
    private Card card;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_cards);

        card = Game.getCurrentCardId();

        cardView = (ImageView) findViewById(R.id.card_rules_image);
        cardDescription = (TextView) findViewById(R.id.card_rules_text);
        dismissBtn = (Button) findViewById(R.id.card_rules_dismiss_btn);

        cardView.setImageResource(card.getId());
        cardDescription.setText(card.getDescription());

        dismissBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
