public class TestGeometricPoint {
    public static void main (String[] args){
        GeometricPoint Point1 = new GeometricPoint (2.0,2.0, "Barcelona");
        GeometricPoint Point2 = new GeometricPoint (4.0,4.0, "Madrid");

        System.out.println(Point1.getX());
        System.out.println(Point1.getY());
        System.out.println(Point1.getname());
        System.out.println(Point1.distance(Point2));
        Point1.setX(3.0);
        System.out.println(Point1.getX());
    }
}
