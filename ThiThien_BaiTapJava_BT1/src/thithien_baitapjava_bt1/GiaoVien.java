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
public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien() {
    }

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    
    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        return ("Giáo viên: "+ this.getHoTen()+"\nTuổi: "+this.getTuoi()+"\nĐịa chỉ: "
                +this.getDiaChi()+"\nSđt: "+this.getSdt()+"\nMôn dạy: " + this.getMonDay() +"\nTổ bộ môn: "+this.getToBoMon()+"\n");
    }
    
    
    
}
