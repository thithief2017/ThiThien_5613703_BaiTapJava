/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author thith
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList();
    public GioHang(IThanhToan thanhToan) {
        this.hinhThucTT = thanhToan;
    }
    public void themHH(HangHoa hangHoa){
        this.dsHH.add(hangHoa);
    }
    public int tienHang(){
        int tam=0;
        for(HangHoa hangHoa : dsHH){
            tam += hangHoa.getGia();
        }
        return tam;
    }
    public void inDSHH(){
        System.out.println("---Danh sách hàng đã mua---");
        for(HangHoa hangHoa: dsHH){
            System.out.println("+" + hangHoa.getTenHH());
        }
    }
    public double thanhToan(){
        return this.hinhThucTT.thanhToan(this.tienHang());
    }
}
