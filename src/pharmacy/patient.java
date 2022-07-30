/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.ArrayList;

/**
 *
 * @author Remon
 */
public class patient extends person{
   int Genericid;
     String patientHistory;
    ArrayList<product> ez;
    order oo;
    

    public patient(int Genericid, String patientHistory, ArrayList<product>ez, String username, String password, String address, String phonenumber, String name) {
        super(username, password, address, phonenumber, name);
        this.Genericid = Genericid;
        this.patientHistory = patientHistory;
        this.ez = ez;
//        for(int i=0;i<os.size();i++){
//        this.os.get(i).addOrdertopatient(this);
//        }
    }
    public patient()
    {
        super("","","","","");
        this.Genericid=0;
        this.patientHistory="";
    }

    
    public void setGenricId(int Genericid) {
        this.Genericid = Genericid;
    }

    public int getGenericid() {
        return Genericid;
    }
    

    public void setPatientHistory(String patientHistory) {
        this.patientHistory = patientHistory;
    }
    public ArrayList<product> addproducttoorder(product a)
   {
       ez.add(a);
       System.out.println("product was added to your order");
  
  return ez;
   }
     public double totalprice()
    {
        double totalprice=0.0;
       for(int i=0;i<ez.size();i++){
 totalprice=totalprice+ez.get(i).quantity*ez.get(i).price;

       }
     System.out.println("Total price is calculated is ="+totalprice);

        return totalprice;
    
    }
    public void pay(paymentmethod payment)
      {
		double amount = totalprice();
		payment.pay(amount);
           
      }

}