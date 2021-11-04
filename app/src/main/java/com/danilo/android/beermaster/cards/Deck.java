package com.danilo.android.beermaster.cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> deck = new ArrayList<>();
    CardUtils helper = CardUtils.getInstance();

    String suits[] = new String[]{"B","B","R","R"};
    //1 - ace, 11 - Jack, 12 - Queen, 13 - King
    int cards[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};

    /**
     * Method to create a deck of 52 cards
     *
     * @return an array list of 52 cards, 26 red and 26 black
     */
   /* public ArrayList createDeck(){

        Card aceS = new SpecialCard(R.drawable.card_1_black);
        deck.add(aceS);
        aceS.setDescription(R.string.card_ace);
        Card aceC = new Card(R.drawable.card_1_black);
        deck.add(aceC);
        aceC.setDescription(R.string.card_ace);
        Card twoS = new SpecialCard(R.drawable.card_2_black);
        deck.add(twoS);
        twoS.setDescription(R.string.card_two_black);
        Card twoC = new Card(R.drawable.card_2_black);
        deck.add(twoC);
        twoC.setDescription(R.string.card_two_black);
        Card threeS = new Card(R.drawable.card_3_black);
        deck.add(threeS);
        threeS.setDescription(R.string.card_three_black);
        Card threeC = new Card(R.drawable.card_3_black);
        deck.add(threeC);
        threeC.setDescription(R.string.card_three_black);
        Card fourS = new Card(R.drawable.card_4_black);
        deck.add(fourS);
        fourS.setDescription(R.string.card_four_black);
        Card fourC = new Card(R.drawable.card_4_black);
        deck.add(fourC);
        fourC.setDescription(R.string.card_four_black);
        Card fiveS = new Card(R.drawable.card_5_black);
        deck.add(fiveS);
        fiveS.setDescription(R.string.card_five_black);
        Card fiveC = new Card(R.drawable.card_5_black);
        deck.add(fiveC);
        fiveC.setDescription(R.string.card_five_black);
        Card sixS = new Card(R.drawable.card_6_black);
        deck.add(sixS);
        sixS.setDescription(R.string.card_six);
        Card sixC = new Card(R.drawable.card_6_black);
        deck.add(sixC);
        sixC.setDescription(R.string.card_six);
        Card sevenS = new Card(R.drawable.card_7_black);
        deck.add(sevenS);
        sevenS.setDescription(R.string.card_seven);
        Card sevenC = new Card(R.drawable.card_7_black);
        deck.add(sevenC);
        sevenC.setDescription(R.string.card_seven);
        Card eightS = new Card(R.drawable.card_8_black);
        deck.add(eightS);
        eightS.setDescription(R.string.card_eight);
        Card eightC = new SpecialCard(R.drawable.card_8_black);
        deck.add(eightC);
        eightC.setDescription(R.string.card_eight);
        Card nineS = new SpecialCard(R.drawable.card_9_black);
        deck.add(nineS);
        nineS.setDescription(R.string.card_nine);
        Card nineC = new Card(R.drawable.card_9_black);
        deck.add(nineC);
        nineC.setDescription(R.string.card_nine);
        Card tenS = new Card(R.drawable.card_10_black);
        deck.add(tenS);
        tenS.setDescription(R.string.card_ten);
        Card tenC = new Card(R.drawable.card_10_black);
        deck.add(tenC);
        tenC.setDescription(R.string.card_ten);
        Card jackS = new Card(R.drawable.card_11_black);
        deck.add(jackS);
        jackS.setDescription(R.string.card_jack);
        Card jackC = new Card(R.drawable.card_11_black);
        deck.add(jackC);
        jackC.setDescription(R.string.card_jack);
        Card queenS = new Card(R.drawable.card_12_black);
        deck.add(queenS);
        queenS.setDescription(R.string.card_queen);
        Card queenC = new SpecialCard(R.drawable.card_12_black);
        deck.add(queenC);
        queenC.setDescription(R.string.card_queen);
        Card kingS = new SpecialCard(R.drawable.card_13_black);
        deck.add(kingS);
        kingS.setDescription(R.string.card_king);
        Card kingC = new SpecialCard(R.drawable.card_13_black);
        deck.add(kingC);
        kingC.setDescription(R.string.card_king);

        Card aceH = new SpecialCard(R.drawable.card_1_red);
        deck.add(aceH);
        aceH.setDescription(R.string.card_ace);
        Card aceD = new SpecialCard(R.drawable.card_1_red);
        deck.add(aceD);
        aceD.setDescription(R.string.card_ace);
        Card twoH = new Card(R.drawable.card_2_red);
        deck.add(twoH);
        twoH.setDescription(R.string.card_two_red);
        Card twoD = new Card(R.drawable.card_2_red);
        deck.add(twoD);
        twoD.setDescription(R.string.card_two_red);
        Card threeH = new Card(R.drawable.card_3_red);
        deck.add(threeH);
        threeH.setDescription(R.string.card_three_red);
        Card threeD = new Card(R.drawable.card_3_red);
        deck.add(threeD);
        threeD.setDescription(R.string.card_three_red);
        Card fourH = new Card(R.drawable.card_4_red);
        deck.add(fourH);
        fourH.setDescription(R.string.card_four_red);
        Card fourD = new Card(R.drawable.card_4_red);
        deck.add(fourD);
        fourD.setDescription(R.string.card_four_red);
        Card fiveH = new Card(R.drawable.card_5_red);
        deck.add(fiveH);
        fiveH.setDescription(R.string.card_five_red);
        Card fiveD = new Card(R.drawable.card_5_red);
        deck.add(fiveD);
        fiveD.setDescription(R.string.card_five_red);
        Card sixH = new Card(R.drawable.card_6_red);
        deck.add(sixH);
        sixH.setDescription(R.string.card_six);
        Card sixD = new Card(R.drawable.card_6_red);
        deck.add(sixD);
        sixD.setDescription(R.string.card_six);
        Card sevenH = new Card(R.drawable.card_7_red);
        deck.add(sevenH);
        sevenH.setDescription(R.string.card_seven);
        Card sevenD = new Card(R.drawable.card_7_red);
        deck.add(sevenD);
        sevenD.setDescription(R.string.card_seven);
        Card eightH = new SpecialCard(R.drawable.card_8_red);
        deck.add(eightH);
        eightH.setDescription(R.string.card_eight);
        Card eightD = new SpecialCard(R.drawable.card_8_red);
        deck.add(eightD);
        eightD.setDescription(R.string.card_eight);
        Card nineH = new Card(R.drawable.card_9_red);
        deck.add(nineH);
        nineH.setDescription(R.string.card_nine);
        Card nineD = new Card(R.drawable.card_9_red);
        deck.add(nineD);
        nineD.setDescription(R.string.card_nine);
        Card tenH = new Card(R.drawable.card_10_red);
        deck.add(tenH);
        tenH.setDescription(R.string.card_ten);
        Card tenD = new Card(R.drawable.card_10_red);
        deck.add(tenD);
        tenD.setDescription(R.string.card_ten);
        Card jackH = new Card(R.drawable.card_11_red);
        deck.add(jackH);
        jackH.setDescription(R.string.card_jack);
        Card jackD = new Card(R.drawable.card_11_red);
        deck.add(jackD);
        jackD.setDescription(R.string.card_jack);
        Card queenH = new SpecialCard(R.drawable.card_12_red);
        deck.add(queenH);
        queenH.setDescription(R.string.card_queen);
        Card queenD = new SpecialCard(R.drawable.card_12_red);
        deck.add(queenD);
        queenD.setDescription(R.string.card_queen);
        Card kingH = new SpecialCard(R.drawable.card_13_red);
        deck.add(kingH);
        kingH.setDescription(R.string.card_king);
        Card kingD = new SpecialCard(R.drawable.card_13_red);
        deck.add(kingD);
        kingD.setDescription(R.string.card_king);


        System.out.println("aceC Descrição - " + aceC.getDescription());
        System.out.println("kingD Descrição - " + kingD.getDescription());

        Collections.shuffle(deck);

        return deck;
    }
*/


    //todo na vez de dois loops,talvez um boleano tipo true=red e false=black
    public ArrayList createDeckShort(){
        helper.populateMaps();
        for (int i=0; i<suits.length; i++){
            for (int j=0; j<cards.length; j++){

                //check if Ace/Eight/Queen/King
                if(cards[j] == 1 || cards[j] == 8 || cards[j] == 12 || cards[j] == 13){
                    Card card = new SpecialCard(helper.getResource(cards[j] + suits[i]));
                    card.setDescription(helper.getDescription(cards[j] + suits[i]));
                    deck.add(card);
                }else{
                    Card card = new Card(helper.getResource(cards[j] + suits[i]));
                    card.setDescription(helper.getDescription(cards[j] + suits[i]));
                    deck.add(card);
                }
            }
        }

        Collections.shuffle(deck);
        return deck;
    };

}
