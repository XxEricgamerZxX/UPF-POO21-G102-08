import java.awt.*;

public class City extends GeoPoint {
    protected int numhab;

    public City(double X, double Y, int H, String name){
        super(X, Y, name);
        numhab=H;
    }
    public int getNumHab() {
        return numhab;
    }

    public void drawCity(Graphics G, int X, int Y, boolean Capital){
        if ( Capital ) {
            
            G.setColor(Color.red);
            G.fillOval( X, Y, 7, 7 );
            G.setColor(Color.blue);
            G.setFont(new Font("AvantGarde", Font.PLAIN | Font.BOLD, 10));
            G.drawString( name , X, Y );
        } else {
            G.setColor(Color.green);
            G.fillOval( X, Y, 7, 7 );
            G.setColor(Color.blue);
            G.setFont(new Font("AvantGarde", Font.PLAIN, 10));
            G.drawString( name , X, Y );
            
        }
        G.setColor(Color.black);
        G.drawOval( X, Y, 7, 7 );
    }
}
