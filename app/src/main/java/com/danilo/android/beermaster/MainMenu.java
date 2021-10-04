package com.danilo.android.beermaster;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

        rulesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), GameRules.class);
                startActivityForResult(myIntent, 0);
            }
        });

        //todo criar UI para cada botão
    }

    @Override
    public void onBackPressed(){
    System.out.println("ON BACK PRESSED");
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("A sair do jogo...")
                .setMessage("Sair? ")
                .setPositiveButton("Y", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }

                }).setNegativeButton("N", null)
                .show();
    }
}
