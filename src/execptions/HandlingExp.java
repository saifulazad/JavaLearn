package execptions;

import java.lang.*;
import java.lang.Exception;

/**
 * Created by Azad on 23-Nov-16.
 */
public class HandlingExp {

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
        }
        catch (Exception ex){
            System.out.println("your string was null");
        }
        /**
         * This line will be executed regardless of exception
         * Here we catch exc properly
         * So program will run . Exceptions will not interrupt
         * normal flow of program
         */
        System.out.println("This line will execute always");
    }
}
