package javathread.demo;

/**
 * Created by Azad on 09-May-16.
 */
public class ThreadTwo implements Runnable {

    @Override
     public void run() {
        
        for (int i=6000;i<7000;i++)
            System.out.println( Thread.currentThread().getName()+i);
        
        
    }
    
}
