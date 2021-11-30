package lab4;

import java.awt.*;

public class Line extends Entity {
    private Point P1;
    private Point P2;

    public Line( Color LineColor,Point initP1, Point initP2){
        super(LineColor);
        initP1=this.P1;
        initP2=this.P2;
    }

    
    public boolean isSelected(Point Punto) {
        // TODO Auto-generated method stub
        return false;
    }

    
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

   
    public void translate(int dx, int dy) {
        /*
        this.P1.getX() += (double)dx ;
        */
    }
    
}
