/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execption;

import java.util.ArrayList;

/**
 *
 * @author Instructor
 */
public class Exception {
    
    
    
    static int ExpFromMethod(int m , int n){
        
        
        if (n <=0){
            throw (new IllegalArgumentException(String.format("the value of %d is <=0", n)));
        }
        
        int result  = m%n;
        
        return result;
    }
    
    public static void main(String[] args) {
      
    
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        ArrayList<String> arrayList2 = new ArrayList<>();
        
        arrayList.add("AB"); arrayList.add("BC"); arrayList.add("CD");
        
        ArrayList<ArrayList<String>> al = new ArrayList<>();
       
        al.add(arrayList);
        
        //arrayList.clear();
               
        arrayList2.add("Hi"); arrayList2.add("Hello"); arrayList2.add("Bye");
        
        al.add(arrayList2);
        
        for (ArrayList<String> al1 : al) {
            //System.out.println(al1.toString());
            for (String al11 : al1) {
                System.out.print(al11 + " ");
            }
            System.out.println("");
        }
               
            
    }
        
    
    
}
