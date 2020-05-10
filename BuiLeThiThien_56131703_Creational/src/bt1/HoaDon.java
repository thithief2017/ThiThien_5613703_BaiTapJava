/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author thith
 */
public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> listCTHD ;
    
    private HoaDon(Builder builder){
        this.hoaDonHeader = builder.hoaDonHeader;
        this.listCTHD = builder.listCTHD; 
    }
    public String toString(){
        String text = "";
        text += hoaDonHeader.toString();
        text += "\nHÓA ĐƠN BAO GỒM: ";
        for (CTHD cthd : listCTHD) {
            text += "\n" + cthd.toString();
        }
        return text;
    }
    public static class Builder{
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> listCTHD = new ArrayList();
        public Builder(){
            
        }
        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader){
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }
        public Builder addCTHD (CTHD cthd){
            this.listCTHD.add(cthd);
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
