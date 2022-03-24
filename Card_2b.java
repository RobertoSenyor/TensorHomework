public class Card_2b {

    private int rank;
    private String suit;

    private String[] check_suit_mas = { "diamonds", "clubs", "hearts", "spades" };

    public Card_2b() {

        this.rank = 1;
        this.suit = "diamonds";
    }

    public Card_2b(int _rank, String _suit) {

        if (_rank >= 1 && _rank <= 10) {

            boolean find_suit = false;
            int buf_len = 1;

            for (String i : check_suit_mas) {

                if (_suit.equals(i)) {

                    find_suit = true;
                    this.rank = _rank;
                    this.suit = _suit;
                } else {

                    if (find_suit != true && buf_len == check_suit_mas.length)
                        System.out.println("Wrong suit arg!");

                }
                buf_len++;
            }
        } else {

            System.out.println("Wrong rank arg!");
        }
    }

    public void get_data() {

        if (this.rank != 0 && this.suit != null)
            System.out.println(this.rank + " " + this.suit);
    }
}
