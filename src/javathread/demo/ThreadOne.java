package javathread.demo;

/**
 * Created by Azad on 09-May-16.
 */
public class ThreadOne  extends Thread{


    @Override
     public void run() {
        
        for (int i=1000;i<5000;i++) {
            System.out.print(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
    
    
    
    
}
