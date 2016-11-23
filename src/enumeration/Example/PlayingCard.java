package enumeration.Example;

/**
 * Created by Azad on 20-Apr-16.
 */
public class PlayingCard {

    private Suit suit;
    private int rank;

    public PlayingCard(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }



    public int getRank() {
        return rank;
    }


    public String getSuitName() {

        String name ="";
     //   System.out.println(suit);
        switch (suit) {
            case SPADES:
                name = "Spades";
                break;
            case HEARTS:
                name = "Hearts";
                break;
            case CLUBS:
                name = "Clubs";
                break;
            case DIAMONDS:
                name = "Diamonds";
                break;
        }
        return name;
    }

}
