public class TestGeometricPoint {
    public static void main (String[] args){
        GeometricPoint Point1 = new GeometricPoint (2.0,2.0);
        GeometricPoint Point2 = new GeometricPoint (4.0,4.0);

        System.out.println(Point1.distance(Point2));
    }
}
