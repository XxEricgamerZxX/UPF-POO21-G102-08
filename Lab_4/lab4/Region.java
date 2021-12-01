package lab4;
import java.awt.*;

public abstract class Region extends Entity {
    protected Color fillcolor;
    
    public Region( Color InitilineColor, Color Initfillcolor){
        super ( InitilineColor );
        fillcolor = Initfillcolor;
    }
    public java.awt.Color getFillColor(){
		return fillcolor;
	}
    public void setFillColor( java.awt.Color InitFill){
        InitFill = fillcolor;
    }

    abstract public double getArea();
    abstract public void draw( Graphics g );
    abstract public Boolean isPointinside(Point p);
    

}