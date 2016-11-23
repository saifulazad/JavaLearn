package execptions;

import java.lang.*;

/**
 * Created by Azad on 23-Nov-16.
 */
public class MultipleTypeExp {
    public static void main(String[] args) {

        String str = null;
        /**
         * Now we are executing our code
         * in try{} catch(){} block
         * We are trying to execute try block code
         * if any exception occurs catch block
         * will catch Appropriate exception
         * based on exp type
         */

        try{


            str.length();
            str.charAt(-1);
        }
        /**
         * An exception handler is considered appropriate if the type of the
         * exception object thrown matches the type that can be handled by the handler.
         */
        catch (NullPointerException ex){
            // If NullPointerException is
            System.out.println("your string was null");

        }
        /**
         * We can use multiple catch block
         * to catch various exp StringIndexOutOfBoundsException
         * is another type of exp
         */
        catch (StringIndexOutOfBoundsException ex){
            // if StringIndexOutOfBoundsException is
            System.out.println("Trying to access invalid position");
        }
    }
}
