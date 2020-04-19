/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author thith
 */
public class baitap2 {
    public static void main(String[] args) {
        GioHang gioHang1 = new GioHang(new ThanhToanOnline());
        GioHang gioHang2 = new GioHang(new ThanhToanCOD());
        HangHoa hangHoa1 = new HangHoa("Cơm sushi",50000,"Cơm sushi tự làm rất ngon");
        HangHoa hangHoa2 = new HangHoa("Ốp lưng điện thoại",100000,"Ốp lưng sản xuất từ Trung Quốc");
        HangHoa hangHoa3 = new HangHoa("Nước lau sàn nhà",150000,"Nước lau sàn sạch mát, thơm tho");
        HangHoa hangHoa4 = new HangHoa("Sạc dự phòng điện thoại",1200000,"Sạc nhanh, dùng lâu");
        HangHoa hangHoa5 = new HangHoa("Quạt nước không khí",4000000,"Công suất cao, mát mẻ trong mùa hè");
        HangHoa hangHoa6 = new HangHoa("Balô du lịch",800000,"Rất tiện lợi khi đi du lịch xa");
        gioHang1.themHH(hangHoa2);
        gioHang1.themHH(hangHoa3);
        gioHang1.themHH(hangHoa6);
        gioHang2.themHH(hangHoa4);
        gioHang2.themHH(hangHoa3);
        gioHang2.themHH(hangHoa6);
        System.out.println("***Thanh toán Online***");
        gioHang1.inDSHH();
        System.out.println("Tổng tiền hàng đã mua: "+ gioHang1.tienHang());
        System.out.println("Số tiền phải trả: "+ gioHang1.thanhToan());
        System.out.println("***Thanh toán COD***");
        gioHang2.inDSHH();
        System.out.println("Tổng tiền hàng đã mua: "+ gioHang2.tienHang());
        System.out.println("Số tiền phải trả: "+ gioHang2.thanhToan());
    }
}
