package lab4;

import java.util.LinkedList;
import java.awt.*;

public class Polygonalregion extends Region {
    private LinkedList<Point> Points= new LinkedList<Point>();

    public Polygonalregion(Color InitilineColor, Color Initfillcolor,LinkedList<Point> Puntos){
        super( InitilineColor, Initfillcolor);
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


    public void draw(Graphics G) {
        int x[] = new int[Points.size()];
        int y[] = new int[Points.size()];
        int index = 0;

        for(int i=0; i < Points.size(); i++){
            x[i] = (int) (Points.get(i).getX());
            y[i] = (int) (Points.get(i).getY());
            index += 1;
        } 
        G.setColor(fillcolor);
        G.fillPolygon( x, y,index );
        G.setColor(lineColor);
        G.drawPolygon( x, y, index );
        
    }


    public void translate(Vector V) {
        int length = Points.size();
        Point P;

        for (int i = 0; i < length; i++){
            P = Points.get(i);
            P.move(V.X, V.Y);
        }
    }


    public boolean isSelected(Point p) {
        if (isPointinside(p) == true){
            return true;
        } else{
            return false;
        }
    }
    
}
