package lab4;

import java.awt.Color;
import java.awt.Graphics;

public class Text extends Entity {
    private Point c;
    private String text;
    
    public Text(Point Initc, String initString, lab4.Color InitColor) {
        super(InitColor);
        c= Initc;
        text= initString;
    }


    public void draw(Graphics g) {
        g.drawString(text, (int) Math.round(c.getY()), (int) Math.round(c.getX()));
        
    }

    
    public void translate(Vector V) {
        c.move(V.X, V.Y);

    }

    public boolean isSelected(Point p) {
        // TODO Auto-generated method stub
        return false;
    }
    public boolean ispointClose(Point p) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
