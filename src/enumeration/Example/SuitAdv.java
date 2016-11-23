package enumeration.Example;

/**
 * Created by Azad on 20-Apr-16.
 */
public enum  SuitAdv {

    SPADES   ("Spades"),
    HEARTS   ("Hearts"),
    CLUBS    ("Clubs"),
    DIAMONDS ("Diamonds");

    private final String name;

    SuitAdv(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}

