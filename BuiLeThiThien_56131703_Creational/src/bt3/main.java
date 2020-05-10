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
public class main {
    public static void main(String[] args) {
        
        //create only 1 Rectangle
        ShapeFactory shapFactory = new ShapeFactory("no", "no", "no");
        Shape rec = shapFactory.createShape(ShapeType.rectangle);
        
        shapFactory = new ShapeFactory("yes", "yes", "yes");
        Shape rec1 = shapFactory.createShape(ShapeType.rectangle);
        System.out.println(rec1.draw());
        
        //create only 1 Circle
        shapFactory = new ShapeFactory("no", "no", "no");
        Shape cir = shapFactory.createShape(ShapeType.circle);
        
        shapFactory = new ShapeFactory("yes", "yes", "yes");
        Shape cir1 = shapFactory.createShape(ShapeType.circle);
        System.out.println(cir.draw());
    }
}
