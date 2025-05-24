/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        System.out.println("Magic Hand:");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);

        System.out.print("Enter card value (1-13): ");
        int userValue = input.nextInt();

        System.out.print("Enter suit number (0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int userSuit = input.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        System.out.println("You picked: " + userCard.getValue() + " of " + userCard.getSuit());
        // and search magicHand here
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue()
                    && magicHand[i].getSuit().equals(userCard.getSuit())) {
                found = true;
            }
        }
        //Then report the result here
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        // add one luckcard hard code 2,clubs
    }

}
