package oncollection;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Azad on 26-Nov-16.
 */
public class JustTest {
    /**
     * A collection — sometimes called a container — is simply an object that groups multiple elements into a single
     * unit. Collections are used to store, retrieve, manipulate, and communicate aggregate data. Typically, they
     * represent data items that form a natural group, such as a poker hand (a collection of cards), a mail folder
     * (a collection of letters), or a telephone directory (a mapping of names to phone numbers). If you have used the
     * Java programming language — or just about any other programming language — you are already familiar with
     * collections
     * https://docs.oracle.com/javase/tutorial/collections/intro/
     * http://stackoverflow.com/questions/559839/big-o-summary-for-java-collections-framework-implementations
     * http://stackoverflow.com/questions/21974361/what-java-collection-should-i-use
     */
    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("Azad");
        stringQueue.add("Hello");

        for (String s : stringQueue){
            System.out.println(s);
        }
    }

}
