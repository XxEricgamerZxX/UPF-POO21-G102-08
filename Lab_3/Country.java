import java.util.LinkedList;
public class Country {
    private String name;
    private LinkedList<City> Cities = new LinkedList<City>();
    private LinkedList<Country> neighbors =new LinkedList<Country>();
    private City Capital;

    public void Country(LinkedList<Point> Puntos,City cap){
        this.Capital=cap; 
    }

}
