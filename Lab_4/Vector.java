import lab3.Point;

public class Vector extends Point {

    public Vector(double InitX, double InitY){
        super(VX,VY);   
    }
    public double productcheck( Vector V2){
        double cross = super.VX * V2.X - super.VY * V2.Y;
        return cross; 
    }
}
