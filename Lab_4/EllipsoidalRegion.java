import java.awt.*;


// remember we need to use abstract methods from Region
public class EllipsoidalRegion extends Region{
    private Point c;
    private double r1;
    private double r2;

    public EllipsoidalRegion(Point initC,double initR1, double initR2){
        super(); // no attributes in Region
        this.c = initC;
        this.r1 = initR1;
        this.r2 = initR2;
    }
 
    public double getRegionArea() {
        double area = 0;
        area = Math.PI * this.r1 * this.r2;
        return area;
    }

    
    public void drawRegion(Graphics g) {
        g.drawOval((int) this.c.getX(), (int) this.c.getY(), (int) this.r1, (int) this.r2);
    }
}