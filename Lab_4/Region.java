import java.awt.*;



public abstract class Region extends Entity {
    protected Color fillcolor;
    
    public Region(){
    }
    public setFillColor( Color InitColor){
        InitColor = fillcolor;
    }

    abstract double getArea();

    abstract bool isPointinside(Point p);

}