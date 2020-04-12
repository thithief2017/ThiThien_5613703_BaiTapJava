/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author thith
 */
public class ChuyenXe {
    String maSoChuyen;
    String hoTenTaiXe;
    String soXe;
    float doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }
    public void inThongTin(){
        System.out.println("+Mã số chuyến: "+maSoChuyen + "\n+Họ tên tài xế: "+hoTenTaiXe+ "\n+Số xe: "+soXe);
    }
}
