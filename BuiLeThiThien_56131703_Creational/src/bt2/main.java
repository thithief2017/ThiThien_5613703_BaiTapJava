/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author thith
 */
public class main {
    public static void main(String[] args) {
        MyStringBuilder str1 = new MyStringBuilder.Builder("Tôi là thiên ").addBool(false);
        MyStringBuilder str2 = new MyStringBuilder.Builder("Chuỗi 2 ").addFloat(36);
        MyStringBuilder str3 = new MyStringBuilder.Builder("abcde").addString("fghijk");
        System.out.println(str1.toString());
        System.out.println(str2.toString());
        System.out.println(str3.toString());
        
    }
}
