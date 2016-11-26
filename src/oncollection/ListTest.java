package oncollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azad on 26-Nov-16.
 */
public class ListTest {

    public static void main(String[] args) {

        // create a list by new keyword
        // List is an interface and ArrayList is it's implementation
        // Advance class feature lecture
        List list = new ArrayList();

        // add is a method of list variable
        list.add("Azad");
        list.add("Azad");
        list.add("Jamil");

        list.remove("jamil");

        for (Object o:
                list) {
            System.out.println(o);
        }
    }
}
