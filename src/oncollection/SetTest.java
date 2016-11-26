package oncollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Azad on 26-Nov-16.
 */
public class SetTest {
    public static void main(String[] args) {

        Set set = new HashSet();
        // add to set
        set.add("Azad");

        set.add("Jamil");
        // Set does not support duplicate
        set.add("Azad");
        set.add("azad");
        set.add("asas");
        set.add("salam");

        for (Object o:
             set) {
            System.out.println(o);
        }

    }
}
