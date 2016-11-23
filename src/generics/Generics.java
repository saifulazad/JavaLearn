package generics;

import java.util.ArrayList;

/**
 * Created by Azad on 28-Apr-16.
 */

/**
 * Generics help parametric type passing
 * Unlike C++ templates, generic Java code generates
 * only one compiled version of a generic class
 *
 * for more help
 * https://docs.oracle.com/javase/tutorial/java/generics/bounded.html
 */
public class Generics {

    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList();

        /**
         * Not type check
         * insert ant type of values to this arrayList
         *
         * you will get error at runtime not compile time
         *
         * Compile time error is Good than Runtime error
         *
         * Generics helps to overcome it
         */

        arrayList.add("Azad");

        arrayList.add(new Integer(12));

        ArrayList<String> strings = new ArrayList();

        strings.add("Hi");
        //Hence strings array only support string
        //strings.add(12);

    }
}
