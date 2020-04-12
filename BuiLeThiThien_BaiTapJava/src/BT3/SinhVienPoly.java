/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author thith
 */
public abstract class SinhVienPoly {
      String hoTen;
      String nganh;

    public SinhVienPoly() {
    }
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        if (getDiem()<5) return "Yếu";
        else if (getDiem()<6.5) return "Trung bình";
            else if (getDiem()<7.5) return "Khá";
                 else if (getDiem()<9) return "Giỏi";
        return "Xuất sắc";
    };

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public void xuat(){
        System.out.println("+Sinh viên: "+hoTen + "\nNgành học: "+nganh);
    };
}
