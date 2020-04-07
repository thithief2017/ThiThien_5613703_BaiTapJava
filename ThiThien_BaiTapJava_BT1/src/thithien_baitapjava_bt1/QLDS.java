/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithien_baitapjava_bt1;

import java.util.ArrayList;

/**
 *
 * @author thith
 */
public class QLDS implements IQLDS {

    ArrayList<CaNhan> dsCaNhan = new ArrayList();
    public QLDS() {
    }
    @Override
    public int them(CaNhan p) {
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten) {
        for (CaNhan p: dsCaNhan){
            if(p.getHoTen()== ten) {
                dsCaNhan.remove(p);
                break;
            }
        }
        return 1;
    }

    @Override
    public void inDS() {
        for(CaNhan p: dsCaNhan){
            System.out.println(p.hienThiTT());
        }
    }
        
}
