public class Card_c {

    private int rank;
    private String suit;

    private String[] check_suit_mas = { "diamonds", "clubs", "hearts", "spades" };

    public Card_c() {

        this.rank = 1;
        this.suit = "diamonds";
    }

    public Card_c(int _rank, String _suit) {

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

    public Card_c(String _suit) {

        int max_rank = 0;
        boolean find_suit = false;
        int buf_len = 1;

        for (String it : check_suit_mas) {

            if (_suit.equals(it)) {

                for (Card_c i : Main.get_deck_array()) {

                    if (_suit.equals(i.get_suit()) && max_rank < i.get_rank()) {

                        max_rank = i.get_rank();

                        if (i.get_rank() >= 10) {
                            max_rank = 9;
                            break;
                        }
                    }
                }

                this.rank = (max_rank + 1);
                this.suit = _suit;

                find_suit = true;

            } else {

                if (find_suit != true && buf_len == check_suit_mas.length)
                    System.out.println("Wrong suit arg!");

            }
            buf_len++;
        }
    }

    public void get_data() {

        if (this.rank != 0 && this.suit != null) {

            System.out.println(this.rank + " " + this.suit);
        }
    }

    public String get_suit() {

        return this.suit;
    }

    public int get_rank() {

        return this.rank;
    }
}