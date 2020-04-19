/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author thith
 */
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhToan(int tienHang) {
        if (tienHang<1000000) return (float)tienHang * 95 / 100;
        else return (float)tienHang * 93 / 100;
    }
    
}
