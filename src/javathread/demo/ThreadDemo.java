package javathread.demo;

import java.util.Date;

/**
 * Created by Azad on 09-May-16.
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Date start = new Date();
        System.out.println("Main Thread starts at"+ start.getTime());
        
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        
        Thread thread = new Thread(t2);
        
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<< Main Thread Start >>>>>>>>>>>>>>>>>");
        
        t1.setName("One");
        thread.setName("Two");
        
//        t1.setPriority(8);
//        thread.setPriority(3);
        
        
        t1.start();
        thread.start();

        t1.join();
        thread.join();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<< Main Thread Finish >>>>>>>>>>>>>>>>>");



        Date end = new Date();
        System.out.println("Main Thread end at"+ end.getTime());
        System.out.println(String.format("Time required %d", end.getTime()-start.getTime()));
        
    }
}
