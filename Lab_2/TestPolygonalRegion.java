
import java.util.LinkedList;

public class TestPolygonalRegion {
    public static void main (String[] args){
        Point Punt1 = new Point(2.0,5.0);
        Point Punt2 = new Point(-3.0,3.0);
        Point Punt3 = new Point(5.0,1.0);

        LinkedList<Point> Points= new LinkedList<Point>();
        Points.add(Punt1);
        Points.add(Punt2);
        Points.add(Punt3);
        PolygonalRegion Puntos = new PolygonalRegion(Points);
        System.out.println(Puntos.getArea());
        
    }
}