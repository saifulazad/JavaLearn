package javathread.demo;

import java.util.Date;

/**
 * Created by Azad on 09-May-16.
 */
public class WithoutThread {

    public static void main(String[] args) {
        Date start = new Date();
        System.out.println("Main Thread starts at "+ start.getTime());

        for (int i=1000;i<5000;i++) {
            System.out.print( Thread.currentThread().getName());
            System.out.println(i);
        }

        for (int i=6000;i<7000;i++)
            System.out.println( Thread.currentThread().getName()+i);

        Date end = new Date();
        System.out.println("Main Thread end at "+ end.getTime());
        System.out.println(String.format("Time required %d", end.getTime()-start.getTime()));
    }

}
