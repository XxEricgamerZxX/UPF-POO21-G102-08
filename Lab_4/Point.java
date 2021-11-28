

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

    public void move( Point P , double disX, double disY ){
        this.X= P.getX()+ disX; 
        this.Y= P.getY()+ disY;
    }
    public Vector difference( Point P2){
        double Xdifference= this.X - P2.getX();
        double Ydifference= this.Y - P2.getY();

        return Xdifference - Ydifference;
    }
}
