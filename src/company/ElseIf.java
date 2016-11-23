package company;

/**
 * Created by Azad on 22-Mar-16.
 */
public class ElseIf {

    public static void main(String[] args) {

        int age = 123;

        final  String ADULT = "You are adult";   // final value is a fixed value

        final  String CHILD = "You are child";

        //ADULT = "A";   error in compilation (as final value is a fixed value )

        final  String OLD = "You are OLD";

        if ( age > 50 ){

            System.out.println(OLD);
        }
        else if ( age > 18 ){
            System.out.println(ADULT);
        }
        else {
            System.out.println(CHILD);
        }
    }
}
