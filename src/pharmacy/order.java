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
   public class order {
  private String name;
    private int quantity;
    private String code;
    private int price;   
    ArrayList<product> pr;
    patient ps;
    private static order or = null;
    
  private order(String name, int quantity, String code, int price)
  {
    
  }
  public order(){
  
  }
  public static order getInstance()
  {
     if(or == null)
     {
      or = new order ("pandol",2,"2056",30);
      System.out.println("order is placed successful");
     }
     else
     {
      System.out.println("sorry another order is taking place please wait");
      return null;
     }
  return or;
  }

  public boolean order_finished(order o)
  {
    o = null;
    or = null;
    return true;
  }
       
    private order(String name, int quantity, String code, int price, ArrayList<product> pr,patient ps) {
        this.name = name;
        this.quantity = quantity;
        this.code=code;
        this.price = price;
        this.pr = new ArrayList<>();
        this.ps=ps;
    }

   public  boolean deccrementProduct(product pr,int quantity){
    
        if(  pr.quantity<=quantity){
             System.out.println("Insufficient  amount in storage");
             return false;
        }
        else{
            pr.quantity-=quantity;
            return true;
        }
        
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPr(product pr) {
        this.pr = new ArrayList<>();
    }
    public void addOrdertopatient(patient ps){
        this.ps=ps;
        
        
    }
}
