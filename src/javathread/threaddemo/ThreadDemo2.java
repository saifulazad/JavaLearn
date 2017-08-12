/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread.threaddemo;

/**
 *
 * @author Azad
 */
public class ThreadDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LoopPrinter printer = new LoopPrinter(10000, 30000);
        printer.setPriority(8);
        printer.start();
        
        
        
        //LoopPrinter printer2 = new LoopPrinter(50000, 70000);
        //printer2.start();
        
        LoopPrinterByInterface printerInterface = new LoopPrinterByInterface(50000, 70000);
        Thread t = new Thread(printerInterface);
        t.start();
        
    }
}
