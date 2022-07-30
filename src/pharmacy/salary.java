package pharmacy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karem
 */
public class salary implements observerReport{
    adminstrator a = new adminstrator("mariam123", "1234", "011","heliopolis","maraim","salary",10,20,30,40,50,60);

    @Override
    public void update(String sname, int expenses, int revenue, int w_hour, int salaryperhour, int unitnumber, int price) {
         a.calculate_salary(sname, expenses, revenue, w_hour, salaryperhour, unitnumber, price);
           System.out.println("\t"+"I am now changed in salary ");
    }
    
}
