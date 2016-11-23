package enumeration.Example;

/**
 * Created by Azad on 20-Apr-16.
 */
public class PlayingCardAdv {
    private SuitAdv suit;
    private int rank;

    public PlayingCardAdv(SuitAdv suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitAdv getSuit() {
        return suit;
    }



    public int getRank() {
        return rank;
    }



}
