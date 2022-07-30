/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author karem
 */
public interface Subject {
    public void addobserver(observerReport ob);
     public void removeobserver(observerReport ob);
      public void notifyobserver();
}
