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
public class staff extends person {
  private int whours;
    private int salary;
    private int id;

    public staff(String username, String password, String address, String phonenumber, String name, int whours, int salary, int id) {
        super(username, password, address, phonenumber, name);
        this.whours=whours;
        this.salary=salary;
        this.id=id;
    }

    public void setWhours(int whours) {
        this.whours = whours;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWhours() {
        return whours;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    
   
}