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
public final class IBCSStudent extends Student{

    public IBCSStudent(String first_name, String last_name, int age, int roll) {
        super(first_name, last_name, age, roll);
    }
    
    public void getVersity(){
        System.out.println("MIST");
    }
    
    @Override
    public  void styleofstudy(){
        System.out.println("Amara java pori");
        
    }
    @Override
     public String full_name(){
        
        System.out.println("All change");
        return "Habi zabi";
        //return "Student "+ super.full_name();
    }
}
