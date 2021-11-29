package lab4;
import java.awt.*;


// remember we need to use abstract methods from Region
public class EllipsoidalRegion extends Region{
    private Point c;
    private double r1;
    private double r2;

    public EllipsoidalRegion(Point initC,double initR1, double initR2){
        super(); 
        this.c = initC;
        this.r1 = initR1;
        this.r2 = initR2;
    }

    @Override
    double getArea() {
        double area = 0;
        area = Math.PI * this.r1 * this.r2;
        return area;
    }

    @Override
    Boolean isPointinside(Point p) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isSelected(Point Punto) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval((int) this.c.getX(), (int) this.c.getY(), (int) this.r1, (int) this.r2);
        
    }

    @Override
    public void translate(int dx, int dy) {
        // TODO Auto-generated method stub
        
    }
}