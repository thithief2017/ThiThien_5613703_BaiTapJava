/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithien_baitapjava_bt1;
/**
 *
 * @author thith
 */
public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;

    public HocSinh() {
    }
    
    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt,String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public String hienThiTT() {
        return ("Học sinh: "+ this.getHoTen()+"\nTuổi: "+this.getTuoi()+"\nĐịa chỉ: "+this.getDiaChi()+"\nSđt: "+this.getSdt()+"\nLớp: "+this.getLop()+"\nNăng khiếu: "+this.getNangKhieu()+"\n");
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    
}
