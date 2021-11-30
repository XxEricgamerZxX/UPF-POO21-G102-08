package lab4;
import java.awt.*;

public abstract class Region extends Entity {
    protected Color fillcolor;
    
    public Region(Color InitlineC, Color InitFill){
        super(InitlineC);
        fillcolor= InitFill;
    }
    public void setFillColor( Color InitFill){
        InitFill = fillcolor;
    }

    abstract public double getArea();
    abstract public void draw( Graphics g );
    abstract public Boolean isPointinside(Point p);
    abstract public void translate( int dx, int dy );

}