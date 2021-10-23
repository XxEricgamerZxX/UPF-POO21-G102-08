public class Testdistancematrix {
    public static void main (String[] args){
        GeometricPoint Point1 = new GeometricPoint (2.0,2.0, "Barcelona");
        GeometricPoint Point2 = new GeometricPoint (4.0,4.0, "Madrid");
        GeometricPoint Point3 = new GeometricPoint (6.0,6.0, "Sevilla");
        GeometricPoint Point4 = new GeometricPoint (0.0,0.0, "Tarragona");

        distancematrix matrix = new distancematrix();

        matrix.addCity(Point1.getX(),Point1.getY(),Point1.getname());
        matrix.addCity(Point2.getX(),Point2.getY(),Point2.getname());
        matrix.addCity(Point3.getX(),Point3.getY(),Point3.getname());
        matrix.addCity(Point4.getX(),Point4.getY(),Point4.getname());
        matrix.createDistanceMatrix();
        System.out.println(matrix.getDistance(1,3));

    }
}
