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
public class BT4 {
    public static void main(String[] args) {
        ChuyenXe chuyenXe1 = new ChuyenXeNgoaiThanh("XE001","Lê Văn A","1111","Hà Nội",7,5000000);
        ChuyenXe chuyenXe2 = new ChuyenXeNgoaiThanh("XE002","Nguyễn B","2234","Huế",2,1000000);
        ChuyenXe chuyenXe3 = new ChuyenXeNgoaiThanh("XE003","Lâm C","3311","Tp HCM",5,300000);
        ChuyenXe chuyenXe4 = new ChuyenXeNoiThanh("XE004","Lâm C","654",1,1000,1000000);
        ChuyenXe chuyenXe5 = new ChuyenXeNoiThanh("XE005","Hà Thị D","307",2,(float)12.5,8000000);
        ChuyenXe chuyenXe6 = new ChuyenXeNoiThanh("XE006","Cao Văn E","1AC",3,500,250000);
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        qlcx.them(chuyenXe1);
        qlcx.them(chuyenXe2);
        qlcx.them(chuyenXe3);
        qlcx.them(chuyenXe4);
        qlcx.them(chuyenXe5);
        qlcx.them(chuyenXe6);
        qlcx.inThongTinTatCa();
        System.out.println("Tổng doanh thu xe nội thành: "+qlcx.getTongDoanhThuXeNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: "+qlcx.getTongDoanhThuXeNgoaiThanh());
        System.out.println("Tổng doanh thu 2 loại xe: "+qlcx.getTongDoanhThu());
    }
}
