/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDesign;

import FunctionEx.Person;

/**
 *
 * @author Azad
 */
public class StudentInh extends Person{
    
    int roll;
    public StudentInh(String first_name, String last_name, int age, int roll){
        super(first_name, last_name, age);
        this.roll = roll;
    }
    public int get_roll(){
        return roll;
    }
    
}
