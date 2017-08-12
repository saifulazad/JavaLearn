package Function;

/**
 * Created by Azad on 4/5/2016.
 */
public class MyFunction {
    /**
     * This is our 1st function declaration and definition
     * having no parameter and  having no parameter
     *
     * return_type   void so having no parameter
     * function_name myfirstFunction
     * parameter list : blank /  having no parameter that means ()
     */

    static void myfirstFunction(){

        System.out.println("Hey this is myfirstFunction's 1st statement");
        System.out.println("Hi I am myfirstFunction I can do many things");


        System.out.println("Hey this is myfirstFunction's last statement");

        return;
    }

    public static void main(String[] args){
        /**
         * call that function from main
         * by myfirstFunction
         * () hence myfirstFunction has no
         * parameter, we call it with no
         * argument
         */
        System.out.println("Hi from main");
        myfirstFunction();
        System.out.println("Hi from main end ");
    }
}
