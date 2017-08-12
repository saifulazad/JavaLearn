/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvfactory;

/**
 *
 * @author Azad
 */
public class Bluetooth implements Remote{

    @Override
    public void connection() {
        System.out.println("I am connecting by Bluetooth");
    }

    @Override
    public void datatranfer() {
        System.out.println("Bluetooth protocall");
    }
    
}
