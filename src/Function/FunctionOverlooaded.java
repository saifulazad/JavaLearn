package Function;

import FunctionEx.Person;


/**
 * Created by Azad on 02-Sep-16.
 */
public class FunctionOverlooaded {
    /**
     * This function tells about which parameter
     * I am passing as argument
     *
     * @param parameter
     */
    static void parameter_type(int parameter){

        System.out.println("You pass int type "+ String.valueOf(parameter));
    }
    static void parameter_type(String parameter){

        System.out.println("You pass String type" + parameter);
    }
    public static void main(String[] args) {
        
        Person azad ;
        

        parameter_type(1);
        parameter_type("Hello java");

    }
}
