package enumeration.Example;

/**
 * Created by Azad on 20-Apr-16.
 */
public class Main {

    public static void main(String[] args) {

        PlayingCard playingCard = new PlayingCard(Suit.CLUBS, 2);

        /**
         *
         */


        //System.out.println(s);
        //System.out.println(Suit.SPADES);
        int x = playingCard.getRank();
        String y = playingCard.getSuitName();
       System.out.println(String.format("card is the %d of %s",x, y));
    }
}
