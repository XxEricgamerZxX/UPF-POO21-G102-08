package lab4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Arrays;

public class TriangularRegion extends Polygonalregion {
    
    public TriangularRegion(Color InitilineColor, Color Initfillcolor,Point p1, Point p2, Point p3) {
        super(InitilineColor,Initfillcolor ,new LinkedList<Point>(Arrays.asList(p1,p2,p3)));
        
    }

    public double getArea(){
    
        return super.getArea();
    }
    
}
