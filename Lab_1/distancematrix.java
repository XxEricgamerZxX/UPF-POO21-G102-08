import java.util.LinkedList;

public class distancematrix implements Matrix{

    private LinkedList<GeometricPoint> cities = new LinkedList<GeometricPoint>();
    // We crate as atributes the Linkedlist of cities and for the matrix we decide to make a double array instead of double LinkedList.
    private double[][] matrix;
    //We put the constructor that is a default constructor.
    public distancematrix() {
    }
    
    public void addCity(double InitX, double InitY, String Name){
        GeometricPoint P = new GeometricPoint(InitX, InitY, Name);
        cities.add(P);
    }
    public String getCityName(int index){
        return cities.get(index).getname();
    }
    public int getNoOfCities(){
        int big=cities.size();
        return big;
    }
    public void createDistanceMatrix(){
        int length = cities.size();
        matrix = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = this.getDistance(i, j);
            }
        }
    }
        
    
    public double getDistance( int index1 , int index2 ){
        matrix[index1][index2] = cities.get(index1).distance(cities.get(index2));
        double Distance= matrix[index1][index2];
        System.out.println("The Distance between " + cities.get(index1).getname() + " and " + cities.get(index2).getname() + " is: " + Distance);
        return Distance;
    }

}
