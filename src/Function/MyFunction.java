package Function;

/**
 * Created by Instructor on 4/5/2016.
 */
public class MyFunction {
    /**
     * This is our 1st function declaration and definition
     * having no parameter and  having no parameter
     *
     * return_type   void so having no parameter
     * function_name myfirstfunction
     * parameter list : blank /  having no parameter that means ()
     */

    static void myfirstfunction(){

        System.out.println("Hey this is myfirstfunction's 1st statement");
        System.out.println("Hi I am myfirstfunction I can do many things");


        System.out.println("Hey this is myfirstfunction's last statement");

        return;
    }

    public static void main(String[] args){
        /**
         * call that function from main
         * by myfirstfunction
         * () hence myfirstfunction has no
         * parameter, we call it with no
         * argument
         */
        System.out.println("Hi from main");
        myfirstfunction();
        System.out.println("Hi from main end ");
    }
}
