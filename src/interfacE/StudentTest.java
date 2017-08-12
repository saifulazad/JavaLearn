/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacE;

import ClassDesign.Student;

/**
 *
 * @author Azad
 */
public class StudentTest {
    public static void main(String[] args) {
        Student mist = new MISTStudent("Saiful", "Azad", 12, 26);
        StudentBehaviour mist1 = new MISTStudent("Saiful", "Azad", 12, 26);
    
        System.out.println(mist.full_name());
        mist1.love();
        mist1.styleofstudy();
        
        
        Student a =(Student) mist1;
    
        System.out.println(a.full_name());
    }
    
}
