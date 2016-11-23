/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDesign;

import interfacE.*;
import ClassDesign.Student;
import javax.rmi.CORBA.Stub;

/**
 *
 * @author Instructor
 */
public class IBCSStudent1 implements StudentBehaviour{


    @Override
    public void love() {
        
          
        System.out.println("IBCS Student are more lovely");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void styleofstudy() {
        System.out.println("They use HP laptops");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
