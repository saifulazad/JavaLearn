package generics;

import java.util.LinkedList;

/**
 * Created by Azad on 28-Apr-16.
 */
public class BoxRevisitedTest {
    public static void main(String[] args) {
        BoxRevisited<Integer> integerBoxRevisited = new BoxRevisited<>(new Integer(12));
        BoxRevisited<Float> floatBoxRevisited = new BoxRevisited<>(new Float(12));
        BoxRevisited<Number> floatBoxRevisiteda;

        /**
         * Bounded Type Parameters
         * This is much more robust feature.
         * Only subclass or same
         * (Number) can be passed as argument.
         * String is not Subclass of Number
         */
        //BoxRevisited<String> stringBoxRevisited ;
    }
}
