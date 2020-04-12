/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author thith
 */
public class BT1 {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Thi Thiên",24,"7 Nguyễn Đình Chiểu",5000000,100);
        NhanVien nv2 = new NhanVien("Tuấn Anh",50,"8 Nguyễn Đình Chiểu",15000000,300);
        NhanVien nv3 = new NhanVien("Nguyễn A",21,"123 Ngô Gia Tự",100000,70);
        NhanVien nv4 = new NhanVien("Đình C",22,"80 Long Biên",2000000,150);
        NhanVien nv5 = new NhanVien("Văn D",18,"11 Lê Đại Hành",30000,200);
        System.out.println("+Thông tin nhân viên 1: \n" + nv1.getThongTin());
        System.out.println("+Thông tin nhân viên 2: \n" + nv2.getThongTin());
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        qlnv.inDS();
    }
}
