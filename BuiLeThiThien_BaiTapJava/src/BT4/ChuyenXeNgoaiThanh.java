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
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh() {
    }
        
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, String noiDen, int soNgayDiDuoc, float doanhThu ) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }


    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("+Nơi đến: "+noiDen+"\n+Số ngày đi được: "+soNgayDiDuoc+"\n+Doanh thu: "+doanhThu);
    }
    
}
