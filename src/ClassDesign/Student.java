/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDesign;

/**
 *
 * @author Azad
 */


 public abstract class Student{
    protected String first_name;
    protected String last_name;
    
    int age;
    int roll;
    public Student(String first_name, String last_name, int age, int roll) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.roll =  roll;
                
    }
    public abstract void styleofstudy();
    
    public String full_name(){
        
        return first_name + " " + last_name;
    }
    public int get_roll(){
        return roll;
    }
    @Override
    public String toString(){
        
        return String.format("First Name: %s, Last Name: %s,Roll: %d",
                first_name, last_name, roll);
    }
    @Override
    public boolean equals(Object object){
        if(object instanceof Student){
            
            Student ob = (Student) object;
            
            return ob.first_name.equals(this.first_name)&&
                    ob.last_name.equals(this.last_name); 
            
        }
        
        return false;
    }
    
}

