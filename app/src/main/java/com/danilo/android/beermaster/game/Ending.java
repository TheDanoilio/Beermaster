package com.danilo.android.beermaster.game;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.danilo.android.beermaster.MainActivity;
import com.danilo.android.beermaster.MainMenu;
import com.danilo.android.beermaster.R;

import androidx.appcompat.app.AppCompatActivity;

public class Ending extends AppCompatActivity {


    public Button newGameBtn;
    public Button mainMenuBtn;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_end);
        //todo criar umas frases pipis para meter no final do jogo
        ImageView endScreen = (ImageView) findViewById(R.id.game_ending);
        endScreen.setImageResource(R.drawable.game_over);

        newGameBtn = (Button) findViewById(R.id.button_new_game);
        mainMenuBtn = (Button) findViewById(R.id.button_main_menu);

        newGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newGameIntent = new Intent(view.getContext(), Game.class);
                startActivityForResult(newGameIntent, 0);
            }
        });
        mainMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainMenuIntent = new Intent(view.getContext(), MainMenu.class);
                startActivityForResult(mainMenuIntent, 0);
            }
        });

    }

    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("A sair do jogo...")
                .setMessage("Sair?")
                .setPositiveButton("Ya, não me aguento.", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }

                }).setNegativeButton("Mão direita é penalty!", null)
                .show();
    }


}
