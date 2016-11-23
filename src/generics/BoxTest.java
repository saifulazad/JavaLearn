package generics;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Azad on 28-Apr-16.
 */
public class BoxTest {

    public static void main(String[] args) {
        /**
         * Hence Box is generic u can save
         * any data type.
         * That means pass type(eg String, Integer) as argument
         *
         * Note: here type means non-primitive data type
         * int, float, double Not Applicable
         */

        Box<String> box = new Box<>("Hi");
        Box<Integer> box2 = new Box<>(new Integer(12));
        Box<BigInteger> bigIntegerBox = new Box<>(new BigInteger("222222222222222222222222222222222"));

        // Support any box type
        // Do not do this. Get error at runtime

        ArrayList<Box> anyboxArrayList = new ArrayList<>();

        // Support String box type only

        ArrayList<Box<String>> boxArrayList = new ArrayList<>();

        boxArrayList.add(box);

    }
}
