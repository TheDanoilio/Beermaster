package com.danilo.android.beermaster;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class GameRules extends AppCompatActivity {

    TextView title;
    TextView explanation;
    ImageView cardPic;
    ListView cardList;
    ImageView cardDescription;
    Button backButton;
    String[] coisas;

    String[] cenas;
    int[] cards = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};



    /*= {"WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP",
            "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP"};*/



    //todo mesma forma de fazer como a nova forma de fazer o deck
    // e ir buscar as imagens para a imageview de forma parecida


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_main);

        coisas = getResources().getStringArray(R.array.main_rules);

        title = (TextView) findViewById(R.id.rules_title);
        backButton = (Button) findViewById(R.id.button_rules_back);
        //cardDescription = (ImageView) findViewById(R.id.rules_description);

        //todo fazer as restantes imagens e associar de forma correta com ali o next todo
        cardPic = (ImageView) findViewById(R.id.main_rules_image);
        cardPic.setImageResource(R.drawable.card_1_small);

        cardList = (ListView) findViewById(R.id.list_of_rules);
        explanation = (TextView) findViewById(R.id.main_rules_text) ;
        explanation.setText(R.string.game_explanation);


        //temporary
        title.setText("Work In Progress");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,R.layout.rules_list_item);
        adapter.addAll(coisas);
        cardList.setAdapter(adapter);
        //todo maybe this? cardList.setOnClickListener();
       // cardDescription.setImageResource(R.drawable.ic_launcher_background);




        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
