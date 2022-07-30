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
public class product {
   String actualName;
   String formula;
   String code;
   double price;
   int quantity;
   int expirationDate;

    public product(String actualName, String formula, String code, int price, int quantity, int expirationDate) {
        this.actualName = actualName;
        this.formula = formula;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

   

    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getActualName() {
        return actualName;
    }

    public String getFormula() {
        return formula;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExpirationDate() {
        return expirationDate;
    }
    
}

