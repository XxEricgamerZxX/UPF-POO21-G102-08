import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {
    private PolygonalRegion region;
    private PolygonalRegion region1;
    public MyMap() {
        initComponents();
        LinkedList< Point > points = new LinkedList< Point >();
        points.add( new Point( 10, 100 ) );
        points.add( new Point( 150, 10 ) );
        points.add( new Point( 290, 100 ) );
        points.add( new Point( 290, 200 ) );
        points.add( new Point( 150, 290 ) );
        points.add( new Point( 10, 200 ) );


        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add( new Point( 560, 100 ) );
        points1.add( new Point( 460, 40 ) );
        points1.add( new Point( 380, 100 ) );
        points1.add( new Point( 380, 200 ) );
        points1.add( new Point( 460, 260 ) );
        points1.add( new Point( 560, 200 ) );

        region = new PolygonalRegion( points );
        region1 = new PolygonalRegion( points1 );
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
        region1.draw( g );
        
        
    }

}

