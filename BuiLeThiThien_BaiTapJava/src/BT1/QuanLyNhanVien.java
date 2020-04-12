/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author thith
 */
public class QuanLyNhanVien implements IQuanLy{

    ArrayList<NhanVien> listNhanVien = new ArrayList();

    public QuanLyNhanVien() {
        
    }
    
    @Override
    public void them(NhanVien nv) {
        listNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        System.out.println("+Danh sách nhân viên:");
        for (NhanVien nv: listNhanVien ){
            System.out.println(nv.getTen());
        }
    }
    
}
