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
public class main {
    public static void main(String[] args) {
        HoaDonHeader header1 = new HoaDonHeader.Builder()
                               .addMaHoaDon("HOADON1")
                               .addNgayBan("10-5-2020")
                               .addTenKhachHang("Bùi Lê Thi Thiên")
                               .build();
        CTHD detail1 = new CTHD.Builder()
                               .addSanPham("Máy hút bụi")
                               .addSoLuong(2)
                               .addDonGia(500000)
                               .addChietKhau(0.1)
                               .build();
        CTHD detail2 = new CTHD.Builder()
                               .addSanPham("Quạt làm mát")
                               .addSoLuong(1)
                               .addDonGia(1000000)
                               .addChietKhau(0.05)
                               .build();
        HoaDon hoaDon1 = new HoaDon.Builder()
                                   .addHoaDonHeader(header1)
                                   .addCTHD(detail1)
                                   .addCTHD(detail2)
                                   .build();
        System.out.println(hoaDon1.toString());
    }
    
}
