package lab4;
import java.awt.*;

public abstract class Region extends Entity {
    protected Color fillcolor;
    
    public Region(Color InitlineC, Color initFill){
        super(InitlineC);
        fillcolor= initFill;
    }
    public Color getFillColor(){
		return fillcolor;
	}
    public void setFillColor( Color InitFill){
        InitFill = fillcolor;
    }

    abstract public double getArea();
    abstract public void draw( Graphics g );
    abstract public Boolean isPointinside(Point p);
    

}