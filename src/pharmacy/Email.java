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
public class Email {
  int storage=50;
  adminstrator a = new adminstrator("mariam123", "1234", "011","heliopolis","maraim","sales",10,200,30,40,40,60);
    public boolean SendEmailAlert(){
     if((storage*0.2)>=(storage-a.units_number)&&storage>a.units_number){
      return true;
      }
     else 
     return false;
    
    }
}
