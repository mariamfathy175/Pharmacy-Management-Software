/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author Remon
 */
public class AlertTypeAdapter implements AlertType  {



    @Override
    public boolean SendAlert() {
        
    PhoneNumber ph=new PhoneNumber();
    Email e=new Email();
    
        ph.SendAlert();
        e.SendEmailAlert();
        if(e.SendEmailAlert()==true&&ph.SendAlert()==true){
        return true;
        }
        return false;
    }
 
    }
    
