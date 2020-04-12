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
public class BT3 {
    public static void main(String[] args) {
        SinhVienPoly sv1 = new SinhVienPoly("Poly Poly", "Nganh A") {
            @Override
            public double getDiem() {
                return 0;
            }
        };
        SinhVienPoly sv2 = new SinhVienIT("Thi Thiên","Công nghệ thông tin",7,7,7);
        SinhVienPoly sv3 = new SinhVienBiz("Nguyễn Văn A", "Tài chính", 8, 8);
        System.out.println("---Sinh viên Poly---");
        sv1.xuat();
        System.out.println("Điểm: " + sv1.getDiem() + "\nHọc lực: "+ sv1.getHocLuc());
        System.out.println("---Sinh viên IT---");
        sv2.xuat();
        System.out.println("Điểm: " + sv2.getDiem() + "\nHọc lực: "+ sv2.getHocLuc());
        System.out.println("---Sinh viên Biz---");
        sv3.xuat();
        System.out.println("Điểm: " + sv3.getDiem() + "\nHọc lực: "+ sv3.getHocLuc());
    }
}
