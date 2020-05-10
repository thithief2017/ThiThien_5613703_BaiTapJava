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
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    double chietKhau;
    private CTHD(Builder builder){
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }
    public String toString(){
        return "-SẢN PHẨM: " + sanPham + "\n +Số lượng: " + soLuong
                + "\n +Đơn giá: " + donGia + " vnđ" + "\n +Chiết khấu: " + chietKhau;
    }
    public static class Builder{
        String sanPham;
        int soLuong;
        double donGia;
        double chietKhau;

        public Builder() {
        }
        public Builder addSanPham(String sanPham){
            this.sanPham = sanPham;
            return this;
        }
        public Builder addSoLuong(int soLuong){
            this.soLuong = soLuong;
            return this;
        }
        public Builder addDonGia(double donGia){
            this.donGia = donGia;
            return this;
        }
        public Builder addChietKhau(double chietKhau){
            this.chietKhau = chietKhau;
            return this;
        }
        public CTHD build(){
            return new CTHD(this);
        }
    }
}
