import java.lang.Math;
public class GeometricPoint {
    private double X;
    private double Y;
    private String name;
    public GeometricPoint( double InitX, double InitY, String Name){
        X= InitX;
        Y= InitY;
        name= Name;
    }
    public String getname(){
        return name;
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
    public void setX( double X){
        this.X=X;
    }
    public void setY( double Y){
        this.Y=Y;
    }
    public double distance( GeometricPoint P){
        double Distance = Math.sqrt(Math.pow(X-P.getX(),2)+ Math.pow(Y-P.getY(),2));
        return Distance;
    }
}
