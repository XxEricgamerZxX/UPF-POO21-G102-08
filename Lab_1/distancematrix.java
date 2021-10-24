import java.util.LinkedList;

public class distancematrix {
    private LinkedList<GeometricPoint> cities = new LinkedList<GeometricPoint>();
    private double[][] matrix;

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
        int length = this.getNoOfCities();
        matrix = new double[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                matrix[i][j]= this.getDistance(i,j);
            }
        }
        
    }
    public double getDistance( int index1 , int index2 ){
        matrix[index1][index2] = cities.get(index1).distance(cities.get(index2));
        return matrix[index1][index2];
    }

}
