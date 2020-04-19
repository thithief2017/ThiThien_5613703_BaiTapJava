/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;

/**
 *
 * @author thith
 */
public class QLSV {
    ISoSanh<SinhVien> hinhThucSS;
    ArrayList<SinhVien> dsSV = new ArrayList();

    public QLSV() {
    }
    public void themSV(SinhVien sv){
        this.dsSV.add(sv);
    }

    public void setHinhThucSS(ISoSanh<SinhVien> hinhThucSS) {
        this.hinhThucSS = hinhThucSS;
    }
    public void sapXep(){
        for (int i=0;i<this.dsSV.size()-1;i++){
            for (int j=i+1;j<this.dsSV.size();j++){
                if(hinhThucSS.soSanh(dsSV.get(i), dsSV.get(j)) == 1){
                    SinhVien tam ;
                    tam = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, tam);  
                }
            }
        }
    }
    public void inDS(){
        System.out.println("---Danh sách sinh viên---");
        for(SinhVien sv : dsSV){
            System.out.println(sv.getHoTen());
            System.out.println("+Ngày sinh: " + sv.getNgaySinh());
            System.out.println("+Điểm TB: " + sv.getDiemTB());
        }
    }
}
