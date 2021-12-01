package lab4;

import java.util.Arrays;
import java.util.LinkedList;


public class RectangularRegion extends Polygonalregion {
  

    public RectangularRegion(Color InitilineColor, Color Initfillcolor, Point p1, Point p2) {
        super( InitilineColor, Initfillcolor, new LinkedList<Point>(Arrays.asList(p1,new Point(p1.getX(), p2.getY()),p2, new Point(p2.getX(), p1.getY()) ) ));
    }
    public double getArea(){
        
        return super.getArea();

    }
    
}
