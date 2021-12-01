package lab4;
import java.awt.*;

public class CircularRegion extends EllipsoidalRegion{
    private Point c;
    private double r;
    
    public CircularRegion(Color InitilineColor, Color Initfillcolor,Point initC, double initR) {
        super( InitilineColor,Initfillcolor,initC, initR, initR);
        this.c = initC;
        this.r = initR;
    }
    
    public double getCircleArea() {
        double area = super.getArea();
        return area;
    }
    
}