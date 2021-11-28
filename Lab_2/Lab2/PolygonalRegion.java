package Lab2;
import java.util.LinkedList;


import java.awt.*;

public class PolygonalRegion {
    private LinkedList<Point> Points= new LinkedList<Point>();;

    public PolygonalRegion(LinkedList<Point> Puntos){ 
        this.Points= Puntos;
    }
    public double getArea(){
        double area= 0.0;
        int length = Points.size();
        
        for (int i=0; i < length-1; i++){
            area += (Points.get(i).getX()*Points.get(i+1).getY()-Points.get(i).getY()*Points.get(i+1).getX())/2.0; 
        } 
        area += (Points.get(length-1).getX()*Points.get(0).getY()-Points.get(length-1).getY()*Points.get(0).getX())/2.0;       
        return area;
    }

    public void draw( Graphics G){

        int x[] = new int[Points.size()];
        int y[] = new int[Points.size()];
        int index = 0;

        for(int i=0; i < Points.size(); i++){
            x[i] = (int) (Points.get(i).getX());
            y[i] = (int) (Points.get(i).getY());
            index += 1;
        } 
        
        G.drawPolygon(x,y,index);
        
    }
}