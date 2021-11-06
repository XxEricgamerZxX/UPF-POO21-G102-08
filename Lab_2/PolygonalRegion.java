import java.util.LinkedList;

public class PolygonalRegion {
    private LinkedList<Point> Points;

    public PolygonalRegion(LinkedList<Point> Points){ 
        LinkedList<Point> Puntos= new LinkedList<Point>();
        this.Points=Puntos;
    }
    public double getArea(){
        double area = 0.0;
        int lenght = Points.size();
        for (int i=0; i < lenght-1; i++){
            area += (Points.get(i).getX()*Points.get(i+1).getY())-(Points.get(i).getY()*Points.get(i+1).getX()) ;
        }
        area += (Points.get(lenght).getX()*Points.get(lenght+1).getY())-(Points.get(lenght).getY()*Points.get(lenght+1).getX()) ;
        return area;
    }
    public void draw( Graphics G, double X, double Y){
    }
}