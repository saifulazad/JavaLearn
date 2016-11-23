package enumeration.Example;

/**
 * Created by Azad on 20-Apr-16.
 */
public class SuitTestAdv {

    public static void main(String[] args) {
        PlayingCardAdv card1 = new PlayingCardAdv(SuitAdv.CLUBS, 2);


        System.out.println("card1 is the " + card1.getRank()
                + " of " + card1.getSuit().getName());
    }
}
