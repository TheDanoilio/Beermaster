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
    ListView cardList;
    ImageView cardDescription;
    Button backButton;


    String[] cenas = {"WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP",
            "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP", "WIP"};






    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules_main);

        title = (TextView) findViewById(R.id.rules_title);
        backButton = (Button) findViewById(R.id.button_rules_back);
        cardDescription = (ImageView) findViewById(R.id.rules_description);
        cardList = (ListView) findViewById(R.id.list_of_rules);


        //temporary
        title.setText("Work In Progress");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_list_item_1, cenas);
        cardList.setAdapter(adapter);
        cardDescription.setImageResource(R.drawable.ic_launcher_background);





        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
