/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithien_baitapjava_bt1;

import java.util.ArrayList;

/**
 *
 * @author thithen
 */
public class LopHoc {
    
    QLDS qldsHS = new QLDS();
    QLDS qldsGVGD = new QLDS();
    CaNhan giaoVienCN = new GiaoVien();
    ArrayList<GiaoVien> dsGVGD =  new ArrayList();
    ArrayList<HocSinh> dsHocSinh = new ArrayList();

    public LopHoc() {
    }
    
    public LopHoc(ArrayList<HocSinh> arrHS, ArrayList<GiaoVien> arrGV, GiaoVien giaoVienCN) {
        this.dsHocSinh = arrHS;
        this.dsGVGD = arrGV;
        this.giaoVienCN = giaoVienCN;
        for (HocSinh hs: this.dsHocSinh){
            qldsHS.them(hs);
        }
        for (GiaoVien gv: this.dsGVGD){
            qldsGVGD.them(gv);
        }
    }

    public QLDS getQldsHS() {
        return qldsHS;
    }

    public void setQldsHS(QLDS qldsHS) {
        this.qldsHS = qldsHS;
    }

    public QLDS getQldsGVGD() {
        return qldsGVGD;
    }

    public void setQldsGVGD(QLDS qldsGVGD) {
        this.qldsGVGD = qldsGVGD;
    }

    public CaNhan getGiaoVienCN() {
        return giaoVienCN;
    }

    public void setGiaoVienCN(CaNhan giaoVienCN) {
        this.giaoVienCN = giaoVienCN;
    }

    public ArrayList<GiaoVien> getDsGVGD() {
        return dsGVGD;
    }

    public void setDsGVGD(ArrayList<GiaoVien> dsGVGD) {
        this.dsGVGD = dsGVGD;
    }

    public ArrayList<HocSinh> getDsHocSinh() {
        return dsHocSinh;
    }

    public void setDsHocSinh(ArrayList<HocSinh> dsHocSinh) {
        this.dsHocSinh = dsHocSinh;
    }
    
    public int themHocSinh(HocSinh hs){
        dsHocSinh.add(hs);
        qldsHS.them(hs);
        return 1;
    }
    public int themGVGD(GiaoVien gv){
        dsGVGD.add(gv);
        qldsGVGD.them(gv);
        return 1;
    }
    public void inDSHS(){
        if(qldsHS.dsCaNhan.size()==0) System.out.println("Không có học sinh");
        else {
            System.out.println("Danh sách học sinh: ");
            qldsHS.inDS();
        }
    }
    public void inDSGVGD(){
        if(qldsGVGD.dsCaNhan.size()==0) System.out.println("Không có giáo viên");
        else {
            System.out.println("Danh sách giáo viên giảng dạy: ");
            qldsGVGD.inDS();
        }
    }
 }
