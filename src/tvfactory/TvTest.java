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
public class TvTest {
    
    public static void main(String[] args) {
        
        
        Remote w = new Wifi();
        Remote b = new Bluetooth();
        TeleVision bappy = new TeleVision(w);
        TeleVision azad = new TeleVision(b);
        
        bappy.connection();
        
        azad.connection();
        
    }
    
}
