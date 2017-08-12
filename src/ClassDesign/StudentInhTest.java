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
public class StudentInhTest {
    public static void main(String[] args) {
        
        Person p = new Person("Hello", "World", 12);
        
        StudentInh studentInh1;
        
        Person another = new StudentInh("Azad","vai", 30, 34);
        
        studentInh1 = (StudentInh) another;
        
        System.out.println(studentInh1.get_roll());
        
        StudentInh studentInh;
        studentInh = new StudentInh("Saiful", "Azad", 17,12);
        
        System.out.println(studentInh.full_name());
        System.out.println(studentInh.get_roll());
    }
    
}
