package com.danilo.android.beermaster.cards;

import com.danilo.android.beermaster.R;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> deck = new ArrayList<>();



    //todo metodo AUTOMATICO para criar o deck ?
    // talvez com algo deste género:

    /*
    String mDrawableName = "myimg";
    int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());
    */

    /*maybe dois for um dentro do outro? tipo

    for (int suitNumber = 0; suitNumber < suit.length; suitNumber++){
       for (int valueNumber = 0; valueNumber < value.length; valueNumber++){
               deck.add(new Card(suit[suitNumber], value[valueNumber]);
       }
   }*/
    //1 - black, 2 - red
    String suits[] = new String[]{"black","black","red","red"};
    //1 - ace, 11 - Jack, 12 - Queen, 13 - King
    int cards[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};

    /**
     * Method to create a deck of 52 cards
     *
     * @return an array list of 52 cards, 26 red and 26 black
     */
    public ArrayList createDeck(){


     /*
        String cardResName = "card_";
        Card card = new Card(0);
        for (int i=0; i<suits.length; i++){
            for (int j=0; j<cards.length; j++){
                    cardResName = "card_" + cards[j] + "_" + suits[i];
                    System.out.println("card Resource name - " + cardResName);
                    card.setDescription(suits[i] +" "+ cards[j]);
                    card.setId(getResId(cardResName, this.getClass()));
                    System.out.println("card id - " + card.getId());
                    deck.add(card);
            }
        }
*/


        Card aceS = new SpecialCard(R.drawable.card_1_black);
        deck.add(aceS);
        aceS.setDescription("As BLACK");
        Card aceC = new Card(R.drawable.card_1_black);
        deck.add(aceC);
        aceC.setDescription("As BLACK");
       /* Card twoS = new SpecialCard(R.drawable.card_2_black);
        deck.add(twoS);
        twoS.setDescription("2 BLACK");
        Card twoC = new Card(R.drawable.card_2_black);
        deck.add(twoC);
        twoC.setDescription("2 BLACK");
        Card threeS = new Card(R.drawable.card_3_black);
        deck.add(threeS);
        threeS.setDescription("3 BLACK");
        Card threeC = new Card(R.drawable.card_3_black);
        deck.add(threeC);
        threeC.setDescription("3 BLACK");
        Card fourS = new Card(R.drawable.card_4_black);
        deck.add(fourS);
        fourS.setDescription("4 BLACK");
        Card fourC = new Card(R.drawable.card_4_black);
        deck.add(fourC);
        fourC.setDescription("4 BLACK");
        Card fiveS = new Card(R.drawable.card_5_black);
        deck.add(fiveS);
        fiveS.setDescription("5 BLACK");
        Card fiveC = new Card(R.drawable.card_5_black);
        deck.add(fiveC);
        fiveC.setDescription("5 BLACK");
        Card sixS = new Card(R.drawable.card_6_black);
        deck.add(sixS);
        sixS.setDescription("6 BLACK");
        Card sixC = new Card(R.drawable.card_6_black);
        deck.add(sixC);
        sixC.setDescription("6 BLACK");
        Card sevenS = new Card(R.drawable.card_7_black);
        deck.add(sevenS);
        sevenS.setDescription("7 BLACK");
        Card sevenC = new Card(R.drawable.card_7_black);
        deck.add(sevenC);
        sevenC.setDescription("7 BLACK");
        Card eightS = new Card(R.drawable.card_8_black);
        deck.add(eightS);
        eightS.setDescription("8 BLACK");
        Card eightC = new SpecialCard(R.drawable.card_8_black);
        deck.add(eightC);
        eightC.setDescription("8 BLACK");
        Card nineS = new SpecialCard(R.drawable.card_9_black);
        deck.add(nineS);
        nineS.setDescription("9 BLACK");
        Card nineC = new Card(R.drawable.card_9_black);
        deck.add(nineC);
        nineC.setDescription("9 BLACK");
        Card tenS = new Card(R.drawable.card_10_black);
        deck.add(tenS);
        tenS.setDescription("10 BLACK");
        Card tenC = new Card(R.drawable.card_10_black);
        deck.add(tenC);
        tenC.setDescription("10 BLACK");
        Card jackS = new Card(R.drawable.card_11_black);
        deck.add(jackS);
        jackS.setDescription("J BLACK");
        Card jackC = new SpecialCard(R.drawable.card_11_black);
        deck.add(jackC);
        jackC.setDescription("J BLACK");
        Card queenS = new SpecialCard(R.drawable.card_12_black);
        deck.add(queenS);
        queenS.setDescription("Q BLACK");
        Card queenC = new SpecialCard(R.drawable.card_12_black);
        deck.add(queenC);
        queenC.setDescription("Q BLACK");
        Card kingS = new SpecialCard(R.drawable.card_13_black);
        deck.add(kingS);
        kingS.setDescription("K BLACK");
        Card kingC = new SpecialCard(R.drawable.card_13_black);
        deck.add(kingC);
        kingC.setDescription("K BLACK");

        Card aceH = new SpecialCard(R.drawable.card_1_red);
        deck.add(aceH);
        aceH.setDescription("As RED");
        Card aceD = new SpecialCard(R.drawable.card_1_red);
        deck.add(aceD);
        aceD.setDescription("As RED");
        Card twoH = new Card(R.drawable.card_2_red);
        deck.add(twoH);
        twoH.setDescription("2 RED");
        Card twoD = new Card(R.drawable.card_2_red);
        deck.add(twoD);
        twoD.setDescription("2 RED");
        Card threeH = new Card(R.drawable.card_3_red);
        deck.add(threeH);
        threeH.setDescription("3 RED");
        Card threeD = new Card(R.drawable.card_3_red);
        deck.add(threeD);
        threeD.setDescription("3 RED");
        Card fourH = new Card(R.drawable.card_4_red);
        deck.add(fourH);
        fourH.setDescription("4 RED");
        Card fourD = new Card(R.drawable.card_4_red);
        deck.add(fourD);
        fourD.setDescription("4 RED");
        Card fiveH = new Card(R.drawable.card_5_red);
        deck.add(fiveH);
        fiveH.setDescription("5 RED");
        Card fiveD = new Card(R.drawable.card_5_red);
        deck.add(fiveD);
        fiveD.setDescription("5 RED");
        Card sixH = new Card(R.drawable.card_6_red);
        deck.add(sixH);
        sixH.setDescription("6 RED");
        Card sixD = new Card(R.drawable.card_6_red);
        deck.add(sixD);
        sixD.setDescription("6 RED");
        Card sevenH = new Card(R.drawable.card_7_red);
        deck.add(sevenH);
        sevenH.setDescription("7 RED");
        Card sevenD = new Card(R.drawable.card_7_red);
        deck.add(sevenD);
        sevenD.setDescription("7 RED");
        Card eightH = new SpecialCard(R.drawable.card_8_red);
        deck.add(eightH);
        eightH.setDescription("8 RED");
        Card eightD = new SpecialCard(R.drawable.card_8_red);
        deck.add(eightD);
        eightD.setDescription("8 RED");
        Card nineH = new Card(R.drawable.card_9_red);
        deck.add(nineH);
        nineH.setDescription("9 RED");
        Card nineD = new Card(R.drawable.card_9_red);
        deck.add(nineD);
        nineD.setDescription("9 RED");
        Card tenH = new Card(R.drawable.card_10_red);
        deck.add(tenH);
        tenH.setDescription("10 RED");
        Card tenD = new Card(R.drawable.card_10_red);
        deck.add(tenD);
        tenD.setDescription("10 RED");
        Card jackH = new Card(R.drawable.card_11_red);
        deck.add(jackH);
        jackH.setDescription("J RED");
        Card jackD = new SpecialCard(R.drawable.card_11_red);
        deck.add(jackD);
        jackD.setDescription("J RED");
        Card queenH = new SpecialCard(R.drawable.card_12_red);
        deck.add(queenH);
        queenH.setDescription("Q RED");
        Card queenD = new SpecialCard(R.drawable.card_12_red);
        deck.add(queenD);
        queenD.setDescription("Q RED");
        Card kingH = new SpecialCard(R.drawable.card_13_red);
        deck.add(kingH);
        kingH.setDescription("K RED");
        Card kingD = new SpecialCard(R.drawable.card_13_red);
        deck.add(kingD);
        kingD.setDescription("K RED");*/


        Collections.shuffle(deck);

        return deck;
    }



}
