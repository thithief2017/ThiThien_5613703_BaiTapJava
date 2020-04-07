/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithien_baitapjava_bt1;

/**
 *
 * @author thith
 */
public class ThiThien_BaiTapJava_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc cntt_59 = new LopHoc();
        HocSinh hs = new HocSinh("Nguyễn Văn A",20,"22 Ngô Văn Đới","0973265412","60KT1","");
        GiaoVien gv = new GiaoVien("Nguyễn Đức Thuần",45,"7 NGuyễn Đình Chiểu","xxxxxx","Cơ sở dữ liệu","Hệ thống thông tin");
        cntt_59.themHocSinh(hs);
        cntt_59.themGVGD(gv);
        gv = new GiaoVien("Huỳnh Tuấn Anh",40,"7 NGuyễn Đình Chiểu","xxxxxx","Mẫu thiết kế","Hệ thống thông tin");
        cntt_59.themGVGD(gv);
        cntt_59.inDSGVGD();
        cntt_59.inDSHS();
    }
    
}
