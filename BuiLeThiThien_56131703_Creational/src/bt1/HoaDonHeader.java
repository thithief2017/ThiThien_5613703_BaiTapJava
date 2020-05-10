/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author thith
 */
public class HoaDonHeader {
    String maHoaDon, ngayBan, tenKhachHang;
    private HoaDonHeader(Builder builder){
        this.maHoaDon = builder.maHoaDon;
        this.ngayBan = builder.ngayBan;
        this.tenKhachHang = builder.tenKhachHang;
    }
    public String toString(){
        return "--------HEADER--------" + "\n+Mã hóa đơn: " + maHoaDon + "\n+Ngày bán: " + ngayBan
                + "\n+Tên khách hàng: " + tenKhachHang;
    }
    public static class Builder{
        String maHoaDon, ngayBan, tenKhachHang;
        public Builder(){
        }
        public Builder addMaHoaDon(String maHoaDon){
            this.maHoaDon = maHoaDon;
            return this;
        }
        public Builder addNgayBan(String ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        public Builder addTenKhachHang(String tenKhachHang){
            this.tenKhachHang = tenKhachHang;
            return this;
        }
        public HoaDonHeader build(){
            return new HoaDonHeader(this);
        }
    }
    
}
