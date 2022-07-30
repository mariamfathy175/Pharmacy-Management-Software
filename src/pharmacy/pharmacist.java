/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class pharmacist  extends person{
    int w_hours;
    
    int salary;
    
    ArrayList<product>b =new ArrayList<>();
    
    ArrayList<patient> pa =new ArrayList<>();
    
    ArrayList<order>os=new ArrayList<>();
    
    public pharmacist(int w_hours,int salary,String username, String password, String phonenumber, String address, String name) {
        super(username, password, phonenumber, address, name);
        
        this.w_hours=w_hours;
        
        this.salary=salary;
    }
    
     public  boolean searchproduct(product a)
   {
       for(int i=0;i<b.size();i++)
       {
       if(b.get(i).code == a.code&&b.get(i).actualName.equals(a.actualName)&&b.get(i).formula.equals(a.formula))
       {
           return true ;
       }
       }
       return false ;
   }
   
   public ArrayList<product> addproduct(product a)
   {
 
      boolean x=true;
      
  for(int i=0;i<b.size();i++)
        {
            if(b.get(i).code == a.code&&b.get(i).actualName.equals(a.actualName)&&b.get(i).formula.equals(a.formula))
            {
               x=false;
              
            }
            else{
               x=true;
               
                            }
            
        }
  
   if(x==true){
    
       b.add(a);
    
     System.out.println("product was added successfully");
  
   }
  else{
            System.out.println("product was already exists");

  }
  return b;
   }
   
   public void getproducts()
   {  
     for(int i=0;i<b.size();i++){
         
System.out.println(b.get(i).actualName+"\t"+b.get(i).formula+"\t"+b.get(i).code+"\t"+b.get(i).quantity);
     }
   
   }
   public boolean thereisproduct()
   {
       if(b.isEmpty()){
    System.out.println("There Is No Product");
     return false;
     }
     else{
     System.out.println("There is Product");
      return true;
     }
   }
   
    public void incrementproduct(product a)
   {
        for(int i=0;i<b.size();i++)
        {
            if(b.get(i).code == a.code&&b.get(i).actualName.equals(a.actualName)&&b.get(i).formula.equals(a.formula))
            {
               a.quantity = b.get(i).quantity + a.quantity ;
            }
        }
   }
    
    
     public boolean addpatientdata(patient a)
   {
       for(int i=0;i<pa.size();i++)
        {
            if(pa.get(i).getGenericid() == a.getGenericid())
            {
            return false ;
            }
        }
       pa.add(a) ;
       return true ;
   }
      
      
  
      
      public boolean deleteproduct(product a)
   {
       for(int i=0;i<b.size();i++)
       {
       if(b.get(i).code == a.code)
       {
           b.remove(a) ;
           System.out.println("product was deleted successfully");
           return true ;
       }
       }
       System.out.println("product not found");
       return false ;
   }
      
    public int getW_hours() {
        return w_hours;
    }

    public void setW_hours(int w_hours) {
        this.w_hours = w_hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}