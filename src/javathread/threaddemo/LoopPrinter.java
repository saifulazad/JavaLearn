/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread.threaddemo;

/**
 *
 * @author Azad
 */
public class LoopPrinter extends Thread {
    
    private int start;
    private int end;
    
    public LoopPrinter(int start, int end){
        this.start = start;
        this.end=end;
    }

    @Override
    public void run() {
        
        System.out.println("Printing started from "+start+ " to "+end);
       
        while(start<=end){
            System.out.println(start+"");
            start++;
        }
        System.out.println("Printing finished  to "+ end);
        
    }
    
    
    
}
