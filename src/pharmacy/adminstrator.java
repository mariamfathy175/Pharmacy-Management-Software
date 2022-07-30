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
public class adminstrator extends person {
    String sname;
    int expenses;
    int revenues;
    int workinghours;
    int salary_per_hour;
    int units_number;
    int price;
    ArrayList <patient> pa=new ArrayList();
    ArrayList <staff> st=new ArrayList();
    
    public adminstrator(String username, String password, String phonenumber, String address, String name,String sname,int expenses,int revenues,int workinghours,int salary_per_hour,int units_number,int price) {
        super(username, password, phonenumber, address, name);
        this.sname=sname;
        this.expenses=expenses;
        this.revenues=revenues;
        this.workinghours=workinghours;
        this.salary_per_hour=salary_per_hour;
        this.units_number=units_number;
        this.price=price;
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
       public boolean add_staff_data(staff s)
   {
       for(int i=0;i<pa.size();i++)
        {
            if(st.get(i).getId() == s.getId())
            {
                System.out.println("this worker is already exist");
            return false ;
            }
        }
       st.add(s) ;
    System.out.println(" worker data is added successfully");
       return true ;
   }
   
    public void calculate_profit(String sname,int expenses,int revenues,int workinghours,int salary_per_hour,int units_number,int price)
    {
       
          double profit =revenues-expenses;
          System.out.print("profit report "+" = "+profit);
    }
      public void calculate_salary(String sname,int expenses,int revenues,int workinghours,int salary_per_hour,int units_number,int price)
    { 
          double salary =salary_per_hour*workinghours;
          System.out.print("salary report "+" = "+salary);
     }
       public void calculate_sales(String sname,int expenses,int revenues,int workinghours,int salary_per_hour,int units_number,int price)
    {
          double sales =units_number*price;
          System.out.print("sales report "+" = "+sales);
     } 
     
       public void view_report(String sname)
    {
        if(sname.equals("salary"))
        {
           calculate_salary(sname,expenses,revenues,workinghours, salary_per_hour, units_number, price);
         }
      else if(sname.equals("profit"))
        {
           calculate_profit(sname,expenses,revenues,workinghours, salary_per_hour, units_number, price);
         }
       else if(sname.equals("sales"))
        {
           calculate_sales(sname,expenses,revenues,workinghours, salary_per_hour, units_number, price);
         }
        else{
            System.out.println("not Found option");
        }
    } 
     
     
    public void view_alert()
    {
    
    AlertTypeAdapter At=new AlertTypeAdapter();
    if(At.SendAlert()==true){
   System.out.println("your inventory level is under normal level");
    }
   
    
    }   

    
}
