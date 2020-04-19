/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Date;

/**
 *
 * @author thith
 */
public class baitap3 {
    public static void main(String[] args) {
       SinhVien sv1 = new SinhVien("Noo Phước Thịnh","14-12-1996",8);
       SinhVien sv2 = new SinhVien("Sơn Tùng","1-1-2000",4);
       SinhVien sv3 = new SinhVien("Ngô Kiến Huy","20-4-1998",9);
       SinhVien sv4 = new SinhVien("Văn Mai Hương","4-3-1997",10);
       QLSV qlsv = new QLSV();
       qlsv.themSV(sv1);
       qlsv.themSV(sv2);
       qlsv.themSV(sv3);
       qlsv.themSV(sv4);
       qlsv.inDS();
       qlsv.setHinhThucSS(new SoSanhTheoTen());
       System.out.println("\nDANH SÁCH SINH VIÊN SAU KHI SẮP XẾP THEO TÊN: ");
       qlsv.sapXep();
       qlsv.inDS();
       qlsv.setHinhThucSS(new SoSanhTheoDiem());
       System.out.println("\nDANH SÁCH SINH VIÊN SAU KHI SẮP XẾP THEO ĐIỂM: ");
       qlsv.sapXep();
       qlsv.inDS();
       
    }
}
