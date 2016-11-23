package FunctionEx;

/**
 * Created by Azad on 02-Sep-16.
 */
public class FunctionOverlooadedEx {
    /**
     * This function tells about which parameter
     * I am passing as argument
     *
     * @param parameter
     */
    static void parameter_type(int parameter){

        System.out.println("You pass int type "+ String.valueOf(parameter));
    }

    // Write your functions here

    static void parameter_type(String parameter){

        System.out.println("You pass String type " + parameter);
    }

    public static void main(String[] args) {

        parameter_type(1);
        parameter_type("Hello java");

        /**
         * At present this supports to
         * pass two type of parameter
         * so output is
         * You pass int type 1
           You pass String type Hello java
         * but I want to process boolean
         * and double so output will be
         *
         * You pass int type 1
           You pass String type Hello java
           You pass double type 12.23
           You pass boolean type false
         * please uncomment // from last
         * two lines and fix the error
         */

        //parameter_type(12.23);
        //parameter_type(false);

    }
}
