package lab4;

public class Point {
    protected double X;
    protected double Y;

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

    public void move( double disX, double disY ){
        this.X += disX; 
        this.Y += disY;
    }
    public Vector difference( Point P2){
        double Xdifference= this.X -P2.getX();
        double Ydifference= this.Y- P2.getY();

        Vector v = new Vector(Xdifference,Ydifference) ;
        return v;
    }
}
