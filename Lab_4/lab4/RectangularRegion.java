package lab4;

import java.util.Arrays;
import java.util.LinkedList;
import java.awt.*;

public class RectangularRegion extends Polygonalregion {
    private LinkedList<Point> Puntos;

    public RectangularRegion(Color InitilineColor, Color Initfillcolor, Point p1, Point p2) {
        super( InitilineColor, Initfillcolor, new LinkedList<Point>(Arrays.asList(p1,p2,new Point(p1.getX(), p2.getY()), new Point(p2.getX(), p1.getY()) ) ));
        Puntos.add( p1 );
        Puntos.add( p2 );
        Puntos.add(new Point(p1.getX(), p2.getY()));
        Puntos.add(new Point(p2.getX(), p1.getY()));
    }
    public double getArea(){
        
        return super.getArea();

    }
    
}
