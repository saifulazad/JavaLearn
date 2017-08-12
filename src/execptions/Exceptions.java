/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execptions;

/**
 *
 * @author Azad
 */
public class Exceptions {
    /**
     * Definition: An exception is an event, which occurs during the execution
     * of a program, that disrupts the normal flow of the program's instructions.
     *
     */
    public static void main(String[] args) {

        String name = null;
        /**
         * We are trying to measure the length of null str
         * This is invalid
         */
        name.length(); // This line you will get an exception
        /**
         * After getting ecx the program will stop
         * immediately that is too bad user experience
         * as well as worse for developer
         */
        System.out.println("This will never display");
    }
        
    
    
}
