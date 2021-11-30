package lab4;
import java.awt.*;

public class CircularRegion extends EllipsoidalRegion{
    private Point c;
    private double r;
    
    public CircularRegion(Color InitlineC, Color InitFill,Point initC, double initR) {
        super(InitlineC,InitFill,initC, initR, initR);
        this.c = initC;
        this.r = initR;
    }
    
    public double getCircleArea() {
        double area = 0;
        area = Math.PI * this.r * this.r;
        return area;
    }
    
}