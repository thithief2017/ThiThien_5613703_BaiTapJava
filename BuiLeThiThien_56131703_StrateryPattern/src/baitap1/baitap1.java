/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author thith
 */
public class baitap1 {
    public static void main(String[] args) {
        context bieuthuc = new context();
        bieuthuc.setTinhToan(new Cong());
        System.out.println(bieuthuc.tinh(75,12));
        
        bieuthuc.setTinhToan(new Tru());
        System.out.println(bieuthuc.tinh(54,78));
    }
}
