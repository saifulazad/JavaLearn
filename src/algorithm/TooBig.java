/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Instructor
 */
public class TooBig {
    public static void main(String[] args) {
        int i, j;
        
        ArrayList<Integer> x  = new ArrayList<Integer>();
        Date d1 = new Date();
        Date d2;
        for ( i =0 ;i < 10000; i= i+1){
            for (j = 0; j< 10000; j++)
            {
                x.add(i*j);
             System.out.println("aasas");
            }
        }
        d2  = new Date();
        long seconds = (d2.getTime()-d1.getTime());
        System.out.println(seconds);
    }
}
