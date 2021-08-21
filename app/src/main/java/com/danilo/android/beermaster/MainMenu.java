package com.danilo.android.beermaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.danilo.android.beermaster.game.Game;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button playButton = (Button) findViewById(R.id.button_menu_play);
        Button modesButton = (Button) findViewById(R.id.button_menu_modes);
        Button rulesButton = (Button) findViewById(R.id.button_menu_rules);

        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent myIntent = new Intent(view.getContext(), Game.class);
                startActivityForResult(myIntent, 0);
            }});

        //todo criar UI para cada botão
    }
}
