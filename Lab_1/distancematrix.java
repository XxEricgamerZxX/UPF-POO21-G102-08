import java.util.LinkedList;

public class distancematrix {
    private LinkedList<GeometricPoint> cities;
    private LinkedList<LinkedList<Double>> matrix;

    public distancematrix() {
        cities = new LinkedList<GeometricPoint>();
        matrix = new LinkedList<LinkedList<Double>>();
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
        for(int i = 0; i < length; i++) {
            List<Integer> list = new LinkedList<Integer>();
            for(int j = 0; j < length; j++) {
                list.add(0);
            }
            matrix.add(list);
        }
    }
}
