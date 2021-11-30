package lab4;

import java.util.Arrays;
import java.util.LinkedList;
import java.awt.*;

public class TriangularRegion extends Polygonalregion {
    private LinkedList<Point> Puntos;

    public TriangularRegion(Color lineColor, Color fillColor,Point p1, Point p2, Point p3) {
        super(lineColor, fillColor,new LinkedList<Point>(Arrays.asList(p1,p2,p3)));
        Puntos.add( p1 );
        Puntos.add( p2 );
        Puntos.add( p3 );
    }
    
    public double getArea(){
        
        return super.getArea();

    }
    
}
