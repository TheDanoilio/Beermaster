package com.danilo.android.beermaster;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
    String[] nomeCartas;

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

        nomeCartas = getResources().getStringArray(R.array.main_rules);

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
        title.setText("Regras");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,R.layout.rules_list_item);
        adapter.addAll(nomeCartas);
        cardList.setAdapter(adapter);
        cardList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        cardPic.setImageResource(R.drawable.card_back);
                        explanation.setText(R.string.game_explanation);
                        break;
                    case 1:
                        cardPic.setImageResource(R.drawable.card_1_small);
                        explanation.setText(R.string.card_ace);
                        break;
                    case 2:
                        cardPic.setImageResource(R.drawable.card_back);
                        explanation.setText(R.string.card_five_red);
                        break;
                    case 3:
                        cardPic.setImageResource(R.drawable.card_back);
                        explanation.setText(R.string.card_five_black);
                        break;
                    case 4:
                        cardPic.setImageResource(R.drawable.card_6_small);
                        explanation.setText(R.string.card_six);
                        break;
                    case 5:
                        cardPic.setImageResource(R.drawable.card_7_small);
                        explanation.setText(R.string.card_seven);
                        break;
                    case 6:
                        cardPic.setImageResource(R.drawable.card_8_small);
                        explanation.setText(R.string.card_eight);
                        break;
                    case 7:
                        cardPic.setImageResource(R.drawable.card_9_small);
                        explanation.setText(R.string.card_nine);
                        break;
                    case 8:
                        cardPic.setImageResource(R.drawable.card_10_small);
                        explanation.setText(R.string.card_ten);
                        break;
                    case 9:
                        cardPic.setImageResource(R.drawable.card_11_small);
                        explanation.setText(R.string.card_jack);
                        break;
                    case 10:
                        cardPic.setImageResource(R.drawable.card_12_small);
                        explanation.setText(R.string.card_queen);
                        break;
                    case 11:
                        cardPic.setImageResource(R.drawable.card_13_small);
                        explanation.setText(R.string.card_king);
                        break;
                    default:
                        cardPic.setImageResource(R.drawable.card_back);
                        explanation.setText(R.string.game_explanation);
                        break;
                }
            }
        });
       // cardDescription.setImageResource(R.drawable.ic_launcher_background);




        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
