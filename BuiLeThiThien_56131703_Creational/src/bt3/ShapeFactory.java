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
public class ShapeFactory {
    private String brush, paper, frame;

    public ShapeFactory(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    
    public Shape createShape(ShapeType shapeType){
        switch (shapeType){
            case rectangle: return Rectangle.createInstance(brush,paper,frame);
            case triangle: return Triangle.createInstance(brush,paper,frame);
            case circle: return Circle.createInstance(brush,paper,frame);
        }
        return null;
    }
}
