package FunctionEx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Instructor
 */
 public class Person{
    private String first_name;
    String last_name;
    
    int age;

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
    
    public String full_name(){
        
        return first_name + " " + last_name;
    }
    
    
}