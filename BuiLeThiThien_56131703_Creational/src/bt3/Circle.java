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
public class Circle extends Shape{
    protected Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    private static Circle instance;
    public static Circle createInstance(String brush, String paper, String frame){
        if (instance == null) {
            instance = new Circle(brush,paper,frame);
        }
        return instance;
    } 
    @Override
    public String draw() {
        return "This is Circle" + "\nBrush: " + this.brush + "\nPaper: " + this.paper + "\nFrame: " + this.frame;
    }
    
}
