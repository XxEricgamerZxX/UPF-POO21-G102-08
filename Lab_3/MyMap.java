import java.util.LinkedList;
import java.awt.*;

public class MyMap extends javax.swing.JPanel {
    private World myWorld;

    public MyMap() {
        initComponents();
        City c1 = new City( 150.0, 200.0, 100 ,"Armand");
        City c2 = new City( 150.0, 100.0, 50, "Eric" );
        City c3 = new City( 150.0, 670.0, 500,"TU"  );
        City c4 = new City( 570.0, 770.0, 500 , "YO" );
        City c5 = new City( 430.0, 200.0,700 , "Split" );
        City c6 = new City( 710.0, 340.0,50 ,  "Fallen Land");
        City c7 = new City( 710.0, 290.0, 613, "Snow Land" );
        City c8 = new City( 859.0, 480.0, 70,  "Breeze");
        City c9 = new City( 850.0, 340.0, 1000, "Rainbow" );
        City c10 = new City( 830.0, 720.0, 900, "Isle" );
        City c11 = new City( 800.0, 810.0, 400, "Doritos" );
        City c12 = new City( 600.0, 670.0, 800, "Boomerang" );
        City c13 = new City( 570.0, 900.0, 600,  "The Poles");
        City c14 = new City( 570.0, 770.0, 800,  "Tail");
        City c15 = new City( 290.0, 770.0, 700,  "Stomach");
        City c16 = new City( 150.0, 670.0,500 ,  "Eye");
        
        // REG 1
        LinkedList< Point > points1 = new LinkedList< Point >();    
        points1.add( new Point( 10.0, 100.0 ) );
        points1.add( new Point( 150.0, 10.0 ) );
        points1.add( new Point( 290.0, 100.0  ) );
        points1.add( new Point( 290.0, 200.0 ) );
        points1.add( new Point( 150.0 ,290.0 ) );
        points1.add( new Point( 10.0, 200.0  ) );


        Country reg1 = new Country( "Coffee", points1, c1 );
        reg1.addCity(c1);
        reg1.addCity(c2);
        
        //REG 2
        LinkedList< Point > points2 = new LinkedList< Point >();    
        points2.add( new Point( 150.0, 290.0 ) );
        points2.add( new Point( 290.0, 200.0  ) );
        points2.add( new Point( 43.0, 290.0   ) );
        points2.add( new Point( 290.0, 390.0 ) );
        points2.add( new Point( 150.0, 390.0  ) );

        Country reg2 = new Country( "Tomorrow", points2, c3);
        reg2.addCity(c3);

        LinkedList< Point > points3 = new LinkedList< Point >();    //REG 3
        points3.add(new Point(200.0,40.0) );
        points3.add(new Point(470.0,350.0) );
        points3.add(new Point(390.0,110.0) );

        Country reg3 = new Country( "Yesterday", points3, c4);
        reg3.addCity(c4);

        LinkedList< Point > points4 = new LinkedList< Point >();    //REG 4
        points4.add( new Point( 290.0, 100.0  ) );
        points4.add( new Point( 290.0, 200.0  ) );
        points4.add( new Point( 430.0, 290.0 ) );
        points4.add( new Point( 430.0, 390.0 ) );
        points4.add( new Point( 570.0, 290.0  ) );
        points4.add( new Point( 570.0, 200.0  ) );
        

        Country reg4 = new Country( "Mochi", points4, c5 );
        reg4.addCity(c5);

        //REG 5
        LinkedList< Point > points5 = new LinkedList< Point >();    
        points5.add( new Point( 570.0, 200.0  ) );
        points5.add( new Point( 570.0, 290.0  ) );
        points5.add( new Point( 710.0, 480.0  ) );
        points5.add( new Point( 850.0, 290.0  ) );
        points5.add( new Point( 710.0, 200.0  ) );
        points5.add( new Point( 710.0, 100.0 ) );
        

        Country reg5 = new Country( "Autumn", points5, c7 );
        reg5.addCity(c6);
        reg5.addCity(c7);
        
        LinkedList< Point > points6 = new LinkedList< Point >();    //REG 6
        points6.add( new Point( 850.0, 290.0 ) );
        points6.add( new Point( 710.0, 480.0 ) );
        points6.add( new Point( 850.0, 580.0  ) );
        points6.add( new Point( 990.0, 480.0 ) );

        
        Country reg6 = new Country( "Paradise", points6, c8);
        reg6.addCity(c8);
        

        LinkedList< Point > points7 = new LinkedList< Point >();    //REG 7
        points7.add( new Point( 570.0, 580.0  ) );
        points7.add( new Point( 570.0, 670.0  ) );
        points7.add( new Point( 430.0, 770.0  ) );
        points7.add( new Point( 710.0, 670.0 ) );


        Country reg7 = new Country( "Moon", points7, c9);
        reg7.addCity(c9);
        
        LinkedList< Point > points8 = new LinkedList< Point >();    //REG 8
        points8.add( new Point( 710.0, 770.0  ) );
        points8.add( new Point( 710.0, 860.0 ) );
        points8.add( new Point( 850.0, 770.0 ) );


        Country reg8 = new Country( "Island", points8, c10 );
        reg8.addCity(c10);

        LinkedList< Point > points9 = new LinkedList< Point >();    //REG 9
        points9.add( new Point( 710.0, 770.0  ) );
        points9.add( new Point( 850.0, 670.0 ) );
        points9.add( new Point( 990.0, 770.0  ) );


        Country reg9 = new Country( "Bermuda", points9, c12);
        reg9.addCity(c11);
        reg9.addCity(c12);

        LinkedList< Point > points10 = new LinkedList< Point >();    //REG 10
        points10.add( new Point( 430.0, 860.0 ) );
        points10.add( new Point( 570.0, 960.0  ) );
        points10.add( new Point( 710.0, 960.0  ) );
        points10.add( new Point( 570.0, 860.0  ) );


        Country reg10 = new Country( "Wings", points10, c14 );
        reg10.addCity(c13);
        reg10.addCity(c14);

        LinkedList< Point > points11 = new LinkedList< Point >();    //REG 11
        points11.add( new Point( 10.0, 580.0  ) );
        points11.add( new Point( 10.0, 670.0 ) );
        points11.add( new Point( 150.0, 770.0  ) );
        points11.add( new Point( 430.0, 860.0 ) );
        points11.add( new Point( 570.0, 860.0 ) );
        points11.add( new Point( 710.0, 670.0 ) );
        points11.add( new Point( 430.0, 770.0  ) );
        points11.add( new Point( 150.0, 580.0  ) );

        
        Country reg11 = new Country( "Whale", points11, c15);
        
        reg11.addCity(c15);
        reg11.addCity(c16);
        
        LinkedList< Country > listreg1 = new LinkedList< Country >();
        listreg1.add(reg1);
        listreg1.add(reg2);
        listreg1.add(reg3);
        listreg1.add(reg4);
        LinkedList< Country > listreg2 = new LinkedList< Country >();
        listreg2.add(reg5);
        listreg2.add(reg6);
        LinkedList< Country > listreg3 = new LinkedList< Country >();
        listreg3.add(reg7);
        listreg3.add(reg8);
        listreg3.add(reg9);
        listreg3.add(reg10);
        listreg3.add(reg11);
        
        Continent cont1 = new Continent( listreg1 );                //CONT 1
        Continent cont2 = new Continent( listreg2 );                //CONT 2
        Continent cont3 = new Continent( listreg3 );                //CONT 3
        LinkedList<Continent> listconts = new LinkedList<Continent>();
        listconts.add(cont1);
        listconts.add(cont2);
        listconts.add(cont3);
        
        myWorld = new World( listconts );                           //WORLD
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
        setBackground(Color.blue);
        super.paint( g );
        myWorld.drawWorld( g );

    }

}

