package lab4;
import java.util.LinkedList;

public class TestEntityDrawer {
    public static void main (String[] args){
        EntityDrawer drawables = new EntityDrawer(); 
        HSV lineC = new HSV( 0,0,255 ); 
        RGB fillC = new RGB( 0,140,128);
        
        //as the second valor is the saturation, we put 0 on liceC and 140 to the other to denote contrast
        
            
        LinkedList< Point > points2 = new LinkedList< Point >();
            
        points2.add( new Point( 150.0, 290.0 ) );
        points2.add( new Point( 290.0, 200.0  ) );
        points2.add( new Point( 420.0, 290.0  ) );
        points2.add( new Point( 360.0, 440.0 ) );
        points2.add( new Point( 220.0, 440.0  ) );

        Polygonalregion poligon = new Polygonalregion(lineC,fillC, points2 );

        EllipsoidalRegion ellipsoid = new EllipsoidalRegion( lineC,fillC, new Point(400, 40 ), 80, 50);
        
        CircularRegion circle = new CircularRegion( lineC,fillC,new Point( 400, 90 ), 40);
        
        TriangularRegion triangle = new TriangularRegion(  lineC,fillC, new Point( 30, 370 ), new Point( 100, 370 ), new Point( 80, 270 ));

        RectangularRegion rectangle = new RectangularRegion( lineC,fillC,new Point( 30, 10 ), new Point( 130, 170 ));

        //Line linea= new Line(lineC,new Point( 220, 80 ), new Point( 270, 80 ));
        //Text texto= new Text(lineC,new Point( 700, 400 ),"Hola como va");
        
        drawables.addDrawable( poligon );
        drawables.addDrawable( ellipsoid );
        drawables.addDrawable( circle );
        drawables.addDrawable( triangle );
        drawables.addDrawable( rectangle );
        //drawables.addDrawable(linea);
        //drawables.addDrawable(texto);
    }
}
