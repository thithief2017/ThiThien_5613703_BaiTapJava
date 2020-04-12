/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

import java.util.ArrayList;

/**
 *
 * @author thith
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> listChuyenXe = new ArrayList();

    public QuanLyChuyenXe() {
    }
    
    public void them(ChuyenXe chuyenXe){
        listChuyenXe.add(chuyenXe);
    }
    public void inThongTinTatCa(){
        System.out.println("DANH SÁCH CHUYẾN XE:");
        for (ChuyenXe chuyenXe : listChuyenXe){
            System.out.println("---Chuyến xe---");
            chuyenXe.inThongTin();
        }
    }
    public void inThongTinChuyenXe(ChuyenXe chuyenXe){
        System.out.println("Thông tin chuyến xe:");
        chuyenXe.inThongTin();
    }
    public float getTongDoanhThuXeNoiThanh(){
        float sum = 0;
        for (ChuyenXe chuyenXe: listChuyenXe){
            if(chuyenXe instanceof ChuyenXeNoiThanh){
            sum += chuyenXe.getDoanhThu();
            }
        }
        return sum;
    }
    public float getTongDoanhThuXeNgoaiThanh(){
        float sum = 0;
        for (ChuyenXe chuyenXe: listChuyenXe){
            if(chuyenXe instanceof ChuyenXeNgoaiThanh){
            sum += chuyenXe.getDoanhThu();
            }
        }
        return sum;
    }
    public float getTongDoanhThu(){
        float sum = 0;
        for (ChuyenXe chuyenXe: listChuyenXe){
            sum += chuyenXe.getDoanhThu();
        }
        return sum;
    }
}
