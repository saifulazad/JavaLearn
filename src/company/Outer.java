package company;

/**
 * Created by Azad on 28-Mar-16.
 */
public class Outer {

    private String text = "I am private!";

    public class Inner {

        public void printText() {
            System.out.println(text);
        }
    }
}
