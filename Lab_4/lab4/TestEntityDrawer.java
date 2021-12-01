package lab4;
import java.util.LinkedList;

public class TestEntityDrawer {
    public static void main (String[] args){
        EntityDrawer drawables = new EntityDrawer(); 
        Color lineC = new Color( 0.0,0.0,255.0, true );   //blue
        Color fillC = new Color( 0.0,128.0,128.0, true );
            
        LinkedList< Point > points1 = new LinkedList< Point >();    
        points1.add( new Point( 10, 80 ) );
        points1.add( new Point( 110, 10 ) );
        points1.add( new Point( 210, 80 ) );
        points1.add( new Point( 210, 140 ) );
        points1.add( new Point( 110, 210 ) );
        points1.add( new Point( 10, 140 ) );
        
        Polygonalregion polReg = new Polygonalregion(lineC,fillC,points1 );

        EllipsoidalRegion ellReg = new EllipsoidalRegion( lineC,fillC, new Point( 230, 230 ), 50, 60);
        
        CircularRegion cirReg = new CircularRegion( lineC,fillC,new Point( 110, 300 ), 40);
        
        TriangularRegion triReg = new TriangularRegion(  lineC,fillC,new Point( 310, 370 ), new Point( 410, 370 ), new Point( 360, 270 ));

        RectangularRegion recReg = new RectangularRegion( lineC,fillC,new Point( 280, 450 ), new Point( 380, 550 ));
        drawables.addDrawable( polReg );
        drawables.addDrawable( ellReg );
        drawables.addDrawable( cirReg );
        drawables.addDrawable( triReg );
        drawables.addDrawable( recReg );
    }
}
