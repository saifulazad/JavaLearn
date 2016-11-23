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
public class IBCSStudentTest {
    public static void main(String[] args) {
        IBCSStudent azad  = new IBCSStudent("Saiful", "Azad", 20, 26);
        
        IBCSStudent zafor  = new IBCSStudent("saiful", "Azad", 20, 26);
        System.out.println(azad.equals(zafor));
       
       // String
        System.out.println("asa".equalsIgnoreCase("aSa"));
     //   System.out.println(azad.equals(zafor));
//        azad.getVersity();
//        System.out.println(azad.full_name());
//        System.out.println(azad.get_roll());
//        
//        System.out.println(azad);
    }
}
