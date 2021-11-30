package lab4;
import java.awt.*;


// remember we need to use abstract methods from Region
public class EllipsoidalRegion extends Region{
    private Point c;
    private double r1;
    private double r2;

    public EllipsoidalRegion(Color InitlineC, Color InitFill, Point initC, double initR1, double initR2){
        super(InitlineC,InitFill); 
        this.c = initC;
        this.r1 = initR1;
        this.r2 = initR2;
    }

    
    public double getArea() {
        double area = 0;
        area = Math.PI * this.r1 * this.r2;
        return area;
    }

    
    public Boolean isPointinside(Point p) {
        
        Boolean isInside = true;
        double check = Math.pow(p.getX()-c.getX(),2)/r1 + Math.pow(p.getY()-c.getY(),2)/r2;
        if ( check <= 1.0){
            return isInside;
        }

        else{
            isInside= false;
            return isInside;
        }

    }

    public boolean isSelected(Point Punto) {
        // TODO Auto-generated method stub
        return false;
    }

   
    public void draw(Graphics g) {
        g.setColor( fillcolor );
        g.fillOval( (int) this.c.getX(), (int) this.c.getY(), (int) r1, (int) r2 );
        g.setColor( lineColor );
        g.drawOval((int) this.c.getX(), (int) this.c.getY(), (int) this.r1, (int) this.r2);
        
    }

    public void translate(int dx, int dy) {
        // TODO Auto-generated method stub
        
    }
}