package company;

/**
 * Created by Azad on 28-Mar-16.
 */
public class OuterClass {


    private String text = "Azad Outer";

    public class Inner{

        public void print(){
            System.out.println(text);
        }
    }
}
