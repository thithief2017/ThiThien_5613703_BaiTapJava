/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author thith
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    

    
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        String ten1="";
        String ten2="";
        for(int i=o1.getHoTen().length()-1; o1.getHoTen().charAt(i)!=' ';i--){
            ten1=o1.getHoTen().charAt(i)+ten2;
        }
        for(int i=o2.getHoTen().length()-1; o2.getHoTen().charAt(i)!=' ';i--){
            ten2=o2.getHoTen().charAt(i)+ten2;
        }
        int kq = ten1.compareTo(ten2);
        if (kq > 0) return 1;
        else if (kq == 0)return 0;
        else return -1;
    }
    
}
