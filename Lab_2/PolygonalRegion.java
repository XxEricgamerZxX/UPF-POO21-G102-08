import java.util.LinkedList;

public class PolygonalRegion {
    private LinkedList<Point> Points= new LinkedList<Point>();;

    public PolygonalRegion(LinkedList<Point> Puntos){ 
        
    }
    public double getArea(){
        double area = 0.0;
        int length = Points.size();
        for (int i=0; i < length-1; i++){
            area += 1/2*((Points.get(i).getX()*Points.get(i+1).getY())-(Points.get(i).getY()*Points.get(i+1).getX())) ;
            
        }
        area += 1/2*((Points.get(length-2).getX()*Points.get(0).getY())-(Points.get(length-2).getY()*Points.get(0).getX()));
        
        return area;
    }
    public void draw( Graphics G, double X, double Y){
    }
}