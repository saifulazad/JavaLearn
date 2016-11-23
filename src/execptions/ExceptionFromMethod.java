package execptions;

/**
 * Created by Azad on 23-Nov-16.
 */
public class ExceptionFromMethod {
    static int ExpFromMethod(int m , int n){

        /**
         * One can throw exception from application level
         * Here we are throwing exception if value of n is
         * less than 0
         *
         */
        if (n <=0){
            throw (new IllegalArgumentException(String.format("the value of %d is <=0", n)));
        }

        int result  = m%n;

        return result;
    }

    public static void main(String[] args) {

        /**
         * This will exe normally
         */
        ExpFromMethod(12, 5);

        /**
         * This will throw an exception from ExceptionFromMethod
         * method. The program will shut down immediately because
         * we are not handling it
         */

        ExpFromMethod(12, -1);

        System.out.println("This line will never execute");

        /**
         * Solve this
         */
    }
}
