/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author thith
 */
public class Triangle extends Shape{
    protected Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    private static Triangle instance;
    public static Triangle createInstance(String brush, String paper, String frame){
        if (instance == null) {
            instance = new Triangle(brush,paper,frame);
        }
        return instance;
    } 
    @Override
    public String draw() {
        return "This is Triangle" + "\nBrush: " + this.brush + "\nPaper: " + this.paper + "\nFrame: " + this.frame;
    }
}
