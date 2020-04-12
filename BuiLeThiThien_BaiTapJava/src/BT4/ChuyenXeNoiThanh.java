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
public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen;
    float soKmDiDuoc;

    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh( String maSoChuyen, String hoTenTaiXe, String soXe,int soTuyen, float soKmDiDuoc, float doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public float getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(float soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("+Số tuyến: "+soTuyen+"\n+Số km đi được: "+ soKmDiDuoc);//To change body of generated methods, choose Tools | Templates.
    }
    
}
