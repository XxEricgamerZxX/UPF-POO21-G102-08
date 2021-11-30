package lab4;

import java.util.LinkedList;
import java.awt.*;

public class Polygonalregion extends Region {
    private LinkedList<Point> Points= new LinkedList<Point>();

    public Polygonalregion(Color lineColor, Color FillColor,LinkedList<Point> Puntos){
        super(lineColor,FillColor); 
        this.Points= Puntos;
    }


    public double getArea() {
        double area= 0.0;
        int length = Points.size();
        
        for (int i=0; i < length-1; i++){
            area += (Points.get(i).getX()*Points.get(i+1).getY()-Points.get(i).getY()*Points.get(i+1).getX())/2.0; 
        } 
        area += (Points.get(length-1).getX()*Points.get(0).getY()-Points.get(length-1).getY()*Points.get(0).getX())/2.0;       
        return area;
    }

   

    public Boolean isPointinside(Point p) {
        Boolean isInside = true;
        int length = Points.size();
        int count1= 0;
        int count2= 0;
        
        for (int i=0; i < length-1; i++){
            Vector V1 = Points.get(i).difference(Points.get(i+1));
            Vector V2 = Points.get(i).difference(p);
            double check = V1.productcheck(V2);

            if (check > 0.0){
                count1 =+ 1 ;
            }
            else{
                count2 =+ 1 ;
            }
        }

        if ( count1 == length-1 || count2 ==length-1){
            return isInside = true;
        }
        else{
            return isInside = false;
        }
        
    }

   
    public boolean isSelected(Point Punto) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void draw(Graphics G) {
        int x[] = new int[Points.size()];
        int y[] = new int[Points.size()];
        int index = 0;

        for(int i=0; i < Points.size(); i++){
            x[i] = (int) (Points.get(i).getX());
            y[i] = (int) (Points.get(i).getY());
            index += 1;
        } 
        G.setColor(Color.white);
        G.fillPolygon( x, y,index );
        G.setColor(Color.yellow);
        G.drawPolygon( x, y, index );
        
    }

    @Override
    public void translate(int dx, int dy) {
        // TODO Auto-generated method stub
        
    }
    
}
