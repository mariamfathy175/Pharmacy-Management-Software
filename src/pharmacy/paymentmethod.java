/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.Scanner;

/**
 *
 * @author Remon
 */
public class paymentmethod {
    
  int choice;
   String name;
   String cardnumber;
   String cvv;
   String expiryDate;
   String email;
   String password;
    public paymentmethod() {
    }
    
    public void pay(double amount)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("If you want to pay by credit card press 1"+"\n"+"If you want to pay in cash press 2");
        choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter name,cardnumber,cvv, expiryDate");
            
            name=sc.next();
            cardnumber=sc.next();
            cvv=sc.next();
            expiryDate=sc.next();
      
            
        }
        else if(choice==2)
        {
            System.out.println("Enter email,password");
            
            email=sc.next();
            password=sc.next();
        }
        else
        {
            System.out.println("Wrong choice ");
        }
    }
    public boolean checkcard(){
      if(cardnumber.length()==5&&cvv.length()==3){
        System.out.println("valid data,now we are placing your order,Wait for us");
        return true;
        }
        else{
        System.out.println("not valid data");
        return false;
        }
    }

 
}