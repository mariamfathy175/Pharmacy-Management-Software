/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.ArrayList;

/**
 *
 * @author karem
 */
public class ReportData implements Subject {
   String sname;
   int expenses;
   int revenue;
   int w_hour;
   int salaryperhour;
   int unitnumber;
   int price;
   adminstrator a;
   ArrayList<observerReport>observers;
    public ReportData(adminstrator a) {
        this.observers = new ArrayList<>();
        this.a=a;
    }

    
    
    @Override
    public void addobserver(observerReport ob) {
       this.observers.add(ob);
    }

    @Override
    public void removeobserver(observerReport ob) {
       this.observers.remove(ob);
    }

    @Override
    public void notifyobserver() {
       for(int i=0;i<observers.size();i++){
           this.observers.get(i).update(sname, expenses, revenue, w_hour, salaryperhour, unitnumber, price);
           
       }
    }
 public void setRData(String sname, int expenses, int revenue, int w_hour, int salaryperhour, int unitnumber, int price){
        this.sname = sname;
        this.expenses = expenses;
        this.revenue = revenue;
        this.w_hour = w_hour;
        this.salaryperhour = salaryperhour;
        this.unitnumber = unitnumber;
        this.price = price;
        notifyobserver();
 }
 
}
