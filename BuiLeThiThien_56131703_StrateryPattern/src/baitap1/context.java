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
public class context {
    ITinh tinhToan;

    public context() {
    }
    
    public void setTinhToan(ITinh tinhToan){
        this.tinhToan = tinhToan;
    }
    public float tinh(float a, float b){
        return this.tinhToan.tinh(a,b);
    }
}
