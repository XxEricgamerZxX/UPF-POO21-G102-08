import java.util.LinkedList;

public class distancematrix {
    private LinkedList<GeometricPoint> cities;
    private double[][] matrix;

    public distancematrix() {
        cities = new LinkedList<GeometricPoint>();
        matrix = new double [0][0];
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
        
    }
    public double getDistance( int index1 , int index2 ){
        matrix[index1][index2] = cities.get(index1).distance(cities.get(index2));
        return matrix[index1][index2];
    }

}
