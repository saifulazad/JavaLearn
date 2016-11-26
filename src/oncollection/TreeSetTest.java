package oncollection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Azad on 26-Nov-16.
 */
public class TreeSetTest {
    public static void main(String[] args) {

        Set set = new TreeSet();

        set.add("Jamil");
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
