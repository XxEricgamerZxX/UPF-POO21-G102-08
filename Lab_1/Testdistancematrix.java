public class Testdistancematrix {
    public static void main (String[] args){
        // We create te points with them coordinates and names(of cities because the aim of the lab)
        GeometricPoint Point1 = new GeometricPoint (2.0,2.0, "Barcelona");
        GeometricPoint Point2 = new GeometricPoint (4.0,4.0, "Madrid");
        GeometricPoint Point3 = new GeometricPoint (6.0,6.0, "Sevilla");
        GeometricPoint Point4 = new GeometricPoint (0.0,0.0, "Tarragona");

        distancematrix matrix = new distancematrix();
        // We declare the matrix and add the points to the linked list.
        matrix.addCity(Point1.getX(),Point1.getY(),Point1.getname());
        matrix.addCity(Point2.getX(),Point2.getY(),Point2.getname());
        matrix.addCity(Point3.getX(),Point3.getY(),Point3.getname());
        matrix.addCity(Point4.getX(),Point4.getY(),Point4.getname());

        // With the "GeometricPoints" added, now we initialize the matrix.
        matrix.createDistanceMatrix();
        // we print for any city name and the number of cities to check that the cities are correctly added.
        System.out.println(matrix.getCityName(1));
        System.out.println(matrix.getNoOfCities());
        // As we can see, we can print each distance one by one but we prefered to do a for and print all of them.
        for(int i=0;i<matrix.getNoOfCities();i++){
            for(int j=0;j<matrix.getNoOfCities();j++){
                System.out.println(matrix.getDistance(i,j));
            }
        }
        /* *
        System.out.println(matrix.getDistance(0,0));
        System.out.println(matrix.getDistance(0,1));
        System.out.println(matrix.getDistance(0,2));
        System.out.println(matrix.getDistance(0,3));
        System.out.println(matrix.getDistance(1,1));
        System.out.println(matrix.getDistance(1,2));
        System.out.println(matrix.getDistance(1,3));
        System.out.println(matrix.getDistance(2,2));
        System.out.println(matrix.getDistance(2,3));
        System.out.println(matrix.getDistance(3,3));
        /** */
    }
}