import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {
    private PolygonalRegion region;
    public MyMap() {
        initComponents();
        LinkedList< Point > points = new LinkedList< Point >();
        points.add( new Point( 10, 100 ) );
        points.add( new Point( 150, 10 ) );
        points.add( new Point( 290, 100 ) );
        points.add( new Point( 290, 200 ) );
        points.add( new Point( 150, 290 ) );
        points.add( new Point( 10, 200 ) );
        region = new PolygonalRegion( points );
        System.out.println( region.getArea() ); 
    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        region.draw( g );
    }

}

