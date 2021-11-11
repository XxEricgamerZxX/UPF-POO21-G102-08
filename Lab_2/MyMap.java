import java.util.LinkedList;


public class MyMap extends javax.swing.JPanel {
    
    private World myWorld ;

    public MyMap() {
        initComponents();

        LinkedList< Point > points1 = new LinkedList< Point >();
        LinkedList< Point > points2 = new LinkedList< Point >();
        LinkedList< Point > points3 = new LinkedList< Point >();
        LinkedList< Point > points4 = new LinkedList< Point >();
        LinkedList< Point > points5 = new LinkedList< Point >();
        LinkedList< Point > points6 = new LinkedList< Point >();
        LinkedList< Point > points7 = new LinkedList< Point >();
        LinkedList< Point > points8 = new LinkedList< Point >();
        LinkedList< Point > points9 = new LinkedList< Point >();
        LinkedList< Point > points10 = new LinkedList< Point >();

        points1.add( new Point( 10, 100 ) );
        points1.add( new Point( 150, 10 ) );
        points1.add( new Point( 290, 100 ) );
        points1.add( new Point( 290, 200 ) );
        points1.add( new Point( 150, 290 ) );
        points1.add( new Point( 10, 200 ) );

        points2.add( new Point( 90, 180 ) );
        points2.add( new Point( 300, 120 ) );
        points2.add( new Point( 340, 150 ) );
        points2.add( new Point( 340, 250 ) );
        points2.add( new Point( 200, 340 ) );
        points2.add( new Point( 60, 250 ) );

        points3.add(new Point(200,40) );
        points3.add(new Point(470,350) );
        points3.add(new Point(390,110) );

        points4.add(new Point(950,60) );
        points4.add(new Point(880,770) );
        points4.add(new Point(580,660 ) );
        points4.add(new Point(890,1000) );

        points5.add(new Point(300,100) );
        points5.add(new Point(350,200) );
        points5.add(new Point(500,410) );
        points5.add(new Point(280,150) );
        points5.add(new Point(470,390) );

        points6.add(new Point(30,15) );
        points6.add(new Point(100,230) );
        points6.add(new Point(70,90) );

        points7.add(new Point(520,720) );
        points7.add(new Point(420,420) );
        points7.add(new Point(190,240) );

        points8.add(new Point(870,990) );
        points8.add(new Point(590,710) );
        points8.add(new Point(20,400) );
        points8.add(new Point(320,407) );


        points9.add(new Point(15,80) );
        points9.add(new Point(230,130) );
        points9.add(new Point(50,50) );

        points10.add(new Point(660,590) );
        points10.add(new Point(300,430) );
        points10.add(new Point(80,120) );
        points10.add(new Point(440,680) );

        PolygonalRegion region1 = new PolygonalRegion( points1 );
        PolygonalRegion region2 = new PolygonalRegion( points2 );
        PolygonalRegion region3 = new PolygonalRegion( points3 );
        PolygonalRegion region4 = new PolygonalRegion( points4 );
        PolygonalRegion region5 = new PolygonalRegion( points5 );
        PolygonalRegion region6 = new PolygonalRegion( points6 );
        PolygonalRegion region7 = new PolygonalRegion( points7 );
        PolygonalRegion region8 = new PolygonalRegion( points8 );
        PolygonalRegion region9 = new PolygonalRegion( points9 );
        PolygonalRegion region10 = new PolygonalRegion( points10 );

        LinkedList <PolygonalRegion> country1 = new LinkedList< PolygonalRegion>();
        country1.add(region1);
        country1.add(region2);

        LinkedList <PolygonalRegion> country2 = new LinkedList< PolygonalRegion>();
        country2.add(region3);
        country2.add(region4);

        LinkedList <PolygonalRegion> country3 = new LinkedList< PolygonalRegion>();
        country3.add(region5);
        country3.add(region6);

        LinkedList <PolygonalRegion> country4 = new LinkedList< PolygonalRegion>();
        country4.add(region7);
        country4.add(region8);

        LinkedList <PolygonalRegion> country5 = new LinkedList< PolygonalRegion>();
        country5.add(region9);
        country5.add(region10);

        Continent continent1= new Continent(country1);
        Continent continent2= new Continent(country2);
        Continent continent3= new Continent(country3);
        Continent continent4= new Continent(country4);
        Continent continent5= new Continent(country5);

        LinkedList<Continent> Mimundo = new LinkedList<Continent>();
        Mimundo.add(continent1);
        Mimundo.add(continent2);
        Mimundo.add(continent3);
        Mimundo.add(continent4);
        Mimundo.add(continent5);

        myWorld = new World( Mimundo );
       
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
        myWorld.drawWorld(g);
    }

}
