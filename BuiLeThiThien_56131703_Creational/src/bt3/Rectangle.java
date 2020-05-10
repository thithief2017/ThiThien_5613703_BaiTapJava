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
public class Rectangle extends Shape{

    protected Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    private static Rectangle instance;
    public static Rectangle createInstance(String brush, String paper, String frame){
        if (instance == null) {
            instance = new Rectangle(brush,paper,frame);
        }
        return instance;
    } 
    @Override
    public String draw() {
        return "This is Rectangle" + "\nBrush: " + this.brush + "\nPaper: " + this.paper + "\nFrame: " + this.frame;
    }
      
}
