package pharmacy;

public class PhoneNumber implements AlertType {
   


    @Override
    public boolean SendAlert() {
        
     AlertTypeAdapter ata= new AlertTypeAdapter();
    int storage=50;
    adminstrator a = new adminstrator("mariam123", "1234", "011","heliopolis","maraim","sales",10,200,30,40,40,60);   

     if((storage*0.2)>=(storage-a.units_number)&&storage>a.units_number){
      return true;
      }
     else 
     return false;
    }
    }

    
