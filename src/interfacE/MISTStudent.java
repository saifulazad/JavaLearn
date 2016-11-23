/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacE;

import ClassDesign.Student;

/**
 *
 * @author Instructor
 */
public class MISTStudent extends Student implements StudentBehaviour{

    public MISTStudent(String first_name, String last_name, int age, int roll) {
        super(first_name, last_name, age, roll);
    }

    @Override
    public void styleofstudy() {
        System.out.println("MIST student has no laptop");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void love() {
        System.out.println("They love many people");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
