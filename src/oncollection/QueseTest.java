package oncollection;

import java.util.*;

/**
 * Created by Azad on 26-Nov-16.
 */

/**
 * This is our own queue
 * @param <E>
 */
class MyQueue<E> extends AbstractQueue<E>{

    private List<E> list = new ArrayList<>();
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean offer(E e) {
        list.add(e);
        return true;
    }

    @Override
    public E poll() {
        if(list.size()!=0){
            E o =  list.get(0);
            list.remove(0);
            return o;
        }
        else return null;
    }

    @Override
    public E peek() {
        if(list.size()!=0){
            E o =  list.get(0);
            return o;
        }
        else return null;
    }
}
public class QueseTest {

    public static void main(String[] args) {
        Queue<String> stringMyQueue = new MyQueue<>();

        Queue<String> stringQueue = new PriorityQueue<>();
        

        stringMyQueue.add("Azad");
        stringMyQueue.add("Belal");

        System.out.println(stringMyQueue.poll());
        stringMyQueue.clear();

        System.out.println(stringMyQueue.size());

    }
}
