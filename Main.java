import java.util.Vector;

public class Main {

    private static Vector<Card_c> deck_of_card;

    public static Vector<Card_c> get_deck_array() {

        if (deck_of_card == null) {

            synchronized (Main.class) {

                deck_of_card = new Vector<Card_c>();
            }
        }
        return deck_of_card;
    }

    public static void main(String[] args) {

        // #A
        // Card_a card1 = new Card_a();
        // card1.rank = 1;
        // card1.suit = "diamonds";
        // System.out.println(card1.rank + " " + card1.suit);

        // #B
        // String okbuf = "diamonds";
        // String errbuf = "qwerty";
        // Card_b card2 = new Card_b(1, okbuf);
        // card2.get_data();
        // card2 = new Card_b(1, errbuf);
        // card2.get_data();
        // card2 = new Card_b(0, okbuf);
        // card2.get_data();

        // #C

        // Card_c card3 = new Card_c(2, okbuf);
        // Card_c card3_1 = new Card_c(4, okbuf);

        // get_deck_array().add(card3);
        // get_deck_array().add(card3_1);

        // Card_c card_3_2 = new Card_c(okbuf);

        // get_deck_array().add(card_3_2);

        // System.out.println("card3 rank: " + card3.get_rank());
        // System.out.println("card3_1 rank: " + card3_1.get_rank());
        // System.out.println("card3_2 rank: " + card_3_2.get_rank());

        // for (Card_c iterable_element : get_deck_array()) {

        // System.out.println("cards " + iterable_element.get_suit() + " rank: " +
        // iterable_element.get_rank());
        // }
    }
}