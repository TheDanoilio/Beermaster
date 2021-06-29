package com.danilo.android.beermaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    Button playButton = (Button) findViewById(R.id.button_main_play);
    playButton.setOnClickListener(new View.OnClickListener(){
        public void onClick(View view){
            Intent myIntent = new Intent(view.getContext(), MainMenu.class);
            startActivityForResult(myIntent, 0);
        }
    });


    }
}