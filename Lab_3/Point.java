public class Point {
    private double X;
    private double Y;

    public Point(double InitX,double InitY){
        X= InitX;
        Y= InitY;
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
}
