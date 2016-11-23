/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDesign;

/**
 *
 * @author Instructor
 */
class StaticValue {
    
    public static final int x;
    static {
        x = 1;
    }
    public StaticValue(){
        //x = x+1;
    }
    
}


public class StaticVar {
    
    public static void main(String[] args) {
        
        StaticValue staticValue = new StaticValue();
        StaticValue staticValue1 = new StaticValue();
        System.out.println(StaticValue.x);
        
    }
    
}
