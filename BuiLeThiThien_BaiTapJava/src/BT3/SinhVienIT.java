/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author thith
 */
public class SinhVienIT extends SinhVienPoly{
    double diemJava,diemHtml,diemCss;

    public SinhVienIT(String hoTen, String nganh,double diemJava, double diemHtml, double diemCss) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }
    @Override
    public double getDiem() {
        return (2*diemJava + diemHtml + diemCss)/4;
    }  

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

}
