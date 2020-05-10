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
public class MyStringBuilder {
    String str ;

    private MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }
    
    @Override
    public String toString(){
        return "Chuỗi của bạn: " + this.str;
    }
    public static class Builder{
        String str = "" ;

        public Builder(String str) {
            this.str = str;
        }
        
        public MyStringBuilder addString(String s){
            this.str += s;
            return new MyStringBuilder(this);
        }
        
        public MyStringBuilder addFloat(float f){
            this.str += f;
            return new MyStringBuilder(this);
        }
        
        public MyStringBuilder addBool(boolean b){
            this.str += (b?"true":"false");
            return new MyStringBuilder(this);
        }
        
    }
}
