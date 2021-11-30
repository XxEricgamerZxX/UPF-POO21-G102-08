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
        g.drawLine((int) Math.round(P1.getX()), (int) Math.round(P1.getY()), (int) Math.round(P2.getX()), (int) Math.round(P2.getY()));
        
    }

   
    public void translate(Vector V) {
        P1.move(V.X , V.Y);
        P2.move(V.X, V.Y);
    }
}
