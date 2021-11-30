package lab4;

public class Vector extends Point {
    
    public Vector(double InitX, double InitY){
        super(InitX,InitY);   
    }
    public double productcheck( Vector V2){
        double cross = super.Y * V2.X - super.X * V2.Y;
        return cross; 
    }
}
