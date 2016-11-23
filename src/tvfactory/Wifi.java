/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvfactory;

/**
 *
 * @author Instructor
 */
public class Wifi implements Remote{

    @Override
    public void connection() {
        System.out.println("I am connecting by Wi-Fi");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void datatranfer() {
        System.out.println("ICMP data transfer");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
