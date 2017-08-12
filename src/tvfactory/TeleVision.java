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
public class TeleVision implements Remote{
    final private  Remote remote;

    public TeleVision(Remote remote){
        this.remote = remote;
    }
    
    @Override
    public void connection() {
        
        remote.connection();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void datatranfer() {
        
        remote.datatranfer();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
