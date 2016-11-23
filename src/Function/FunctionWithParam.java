package Function;

/**
 * Created by Instructor on 4/5/2016.
 */
public class FunctionWithParam {
    /**
     * This is our 2nd function declaration and definition
     * having 1 parameter and no return type
     *
     *
     * return_type   void
     * function_name my2ndfunctionWithparam
     * parameter list :  my_name that means (String my_name)
     */
    static void my2ndfunctionWithparam(String my_name){

        String name = "Azad";
        System.out.println("In my2ndfunctionWithparam");
        System.out.println(my_name);

    }

    public static void main(String[] args){

        String name = "Azad";
        String my_name = "Azad";
        my2ndfunctionWithparam("Azad");


    }
}
