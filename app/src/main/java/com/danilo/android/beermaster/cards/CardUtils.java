package com.danilo.android.beermaster.cards;

import java.util.HashMap;
import java.util.Map;

import com.danilo.android.beermaster.R;

public class CardUtils {

    public Map<String, Integer> cardResources = new HashMap<String, Integer>(26);
    public Map<String, Integer> cardRules = new HashMap<String, Integer>(26);
    private static CardUtils instance = null;


    private CardUtils(){};

    public static CardUtils getInstance(){
        if(instance == null){
            return new CardUtils();
        }
        return instance;
    }

    public void populateMaps(){
        populateResourceMap();
        populateRulesMap();
    }

    public int getResource(String key){
        return cardResources.get(key);
    }

    public int getDescription(String key){
        return cardRules.get(key);
    }

    private void populateResourceMap(){
        cardResources.put("1B", R.drawable.card_1_black);
        cardResources.put("2B", R.drawable.card_2_black);
        cardResources.put("3B", R.drawable.card_3_black);
        cardResources.put("4B", R.drawable.card_4_black);
        cardResources.put("5B", R.drawable.card_5_black);
        cardResources.put("6B", R.drawable.card_6_black);
        cardResources.put("7B", R.drawable.card_7_black);
        cardResources.put("8B", R.drawable.card_8_black);
        cardResources.put("9B", R.drawable.card_9_black);
        cardResources.put("10B", R.drawable.card_10_black);
        cardResources.put("11B", R.drawable.card_11_black);
        cardResources.put("12B", R.drawable.card_12_black);
        cardResources.put("13B", R.drawable.card_13_black);

        cardResources.put("1R", R.drawable.card_1_red);
        cardResources.put("2R", R.drawable.card_2_red);
        cardResources.put("3R", R.drawable.card_3_red);
        cardResources.put("4R", R.drawable.card_4_red);
        cardResources.put("5R", R.drawable.card_5_red);
        cardResources.put("6R", R.drawable.card_6_red);
        cardResources.put("7R", R.drawable.card_7_red);
        cardResources.put("8R", R.drawable.card_8_red);
        cardResources.put("9R", R.drawable.card_9_red);
        cardResources.put("10R", R.drawable.card_10_red);
        cardResources.put("11R", R.drawable.card_11_red);
        cardResources.put("12R", R.drawable.card_12_red);
        cardResources.put("13R", R.drawable.card_13_red);
    }

    private void populateRulesMap(){
        cardRules.put("1B", R.string.card_ace);
        cardRules.put("1R", R.string.card_ace);
        cardRules.put("2B", R.string.card_two_black);
        cardRules.put("2R", R.string.card_two_red);
        cardRules.put("3B", R.string.card_three_black);
        cardRules.put("3R", R.string.card_three_red);
        cardRules.put("4B", R.string.card_four_black);
        cardRules.put("4R", R.string.card_four_red);
        cardRules.put("5B", R.string.card_five_black);
        cardRules.put("5R", R.string.card_five_red);
        cardRules.put("6B", R.string.card_six);
        cardRules.put("6R", R.string.card_six);
        cardRules.put("7B", R.string.card_seven);
        cardRules.put("7R", R.string.card_seven);
        cardRules.put("8B", R.string.card_eight);
        cardRules.put("8R", R.string.card_eight);
        cardRules.put("9B", R.string.card_nine);
        cardRules.put("9R", R.string.card_nine);
        cardRules.put("10B", R.string.card_ten);
        cardRules.put("10R", R.string.card_ten);
        cardRules.put("11B", R.string.card_jack);
        cardRules.put("11R", R.string.card_jack);
        cardRules.put("12B", R.string.card_queen);
        cardRules.put("12R", R.string.card_queen);
        cardRules.put("13B", R.string.card_king);
        cardRules.put("13R", R.string.card_king);
    };

}
