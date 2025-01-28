public class Card {

    //data variables
    //fields from file = heart, ace, 11,ah.gif
    private String suit;
    private int value;
    private String rank;

    //put other 3 data variables here as private

    //constructor
    public Card() {
        suit = "heart";
        value = 10;
    }

    public Card(String suit, String rank, int value, String picName) {
        this.suit = suit;
        this.value = value;
        this.rank = rank;

    }

    //setters and getters
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit () {
        return suit;
    }

    public boolean equals(Card other) {
        return rank.equals(other.rank);
    }

    public String toString() {
        return "suit " + suit + " value" + value;
    }
    
}
