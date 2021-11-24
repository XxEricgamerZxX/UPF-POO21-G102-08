import java.util.LinkedList;
import java.awt.*;

public class MyMap extends javax.swing.JPanel {
    private World myWorld;

    public MyMap() {
        initComponents();
        City city1 = new City( 150.0, 200.0, 100 ,"Madrid");
        City city2 = new City( 150.0, 100.0, 50, "BCN" );
        City city3 = new City( 180.0, 210.0, 500,"Sevilla"  );
        City city4 = new City( 260.0, 80.0, 500 , "Malaga" );
        City city5 = new City( 430.0, 200.0,700 , "Cadiz" );
        City city6 = new City( 710.0, 340.0,50 ,  "Zgz");
        City city7 = new City( 710.0, 290.0, 613, "Teruel" );
        City city8 = new City( 859.0, 480.0, 70,  "Mallorca");
        City city9 = new City( 850.0, 340.0, 1000, "Vic" );
        City city10 = new City( 830.0, 720.0, 900, "Vigo" );
        City city11 = new City( 800.0, 810.0, 400, "Huesca" );
        City city12 = new City( 600.0, 670.0, 800, "Cuenca" );
        City city13 = new City( 830.0, 690.0, 600,  "Olot");
        City city14 = new City( 855.0, 690.0, 800,  "Leon");
        City city15 = new City( 210.0, 685.0, 700,  "Bilbao");
        City city16 = new City( 150.0, 670.0,500 ,  "Pals");
        
        // REG 1
        LinkedList< Point > points1 = new LinkedList< Point >();    
        points1.add( new Point( 10.0, 100.0 ) );
        points1.add( new Point( 150.0, 10.0 ) );
        points1.add( new Point( 290.0, 100.0  ) );
        points1.add( new Point( 290.0, 200.0 ) );
        points1.add( new Point( 150.0 ,290.0 ) );
        points1.add( new Point( 10.0, 200.0  ) );


        Country reg1 = new Country( "Spain", points1, city1 );
        reg1.addCity(city1);
        reg1.addCity(city2);
        
        //REG 2
        LinkedList< Point > points2 = new LinkedList< Point >();    
        points2.add( new Point( 150.0, 290.0 ) );
        points2.add( new Point( 290.0, 200.0  ) );
        points2.add( new Point( 43.0, 290.0   ) );
        points2.add( new Point( 290.0, 390.0 ) );
        points2.add( new Point( 150.0, 390.0  ) );

        Country reg2 = new Country( "France", points2, city3);
        reg2.addCity(city3);

        LinkedList< Point > points3 = new LinkedList< Point >();   
        points3.add(new Point(200.0,40.0) );
        points3.add(new Point(470.0,350.0) );
        points3.add(new Point(390.0,110.0) );

        Country reg3 = new Country( "Portugal", points3, city4);
        reg3.addCity(city4);

        LinkedList< Point > points4 = new LinkedList< Point >();    
        points4.add( new Point( 290.0, 100.0  ) );
        points4.add( new Point( 290.0, 200.0  ) );
        points4.add( new Point( 430.0, 290.0 ) );
        points4.add( new Point( 430.0, 390.0 ) );
        points4.add( new Point( 570.0, 290.0  ) );
        points4.add( new Point( 570.0, 200.0  ) );
        

        Country reg4 = new Country( "Germany", points4, city5 );
        reg4.addCity(city5);

        //REG 5
        LinkedList< Point > points5 = new LinkedList< Point >();    
        points5.add( new Point( 570.0, 200.0  ) );
        points5.add( new Point( 570.0, 290.0  ) );
        points5.add( new Point( 710.0, 480.0  ) );
        points5.add( new Point( 850.0, 290.0  ) );
        points5.add( new Point( 710.0, 200.0  ) );
        points5.add( new Point( 710.0, 100.0 ) );
        

        Country reg5 = new Country( "Greace", points5, city7 );
        reg5.addCity(city6);
        reg5.addCity(city7);
        
        LinkedList< Point > points6 = new LinkedList< Point >();   
        points6.add( new Point( 850.0, 290.0 ) );
        points6.add( new Point( 710.0, 480.0 ) );
        points6.add( new Point( 850.0, 580.0  ) );
        points6.add( new Point( 990.0, 480.0 ) );

        
        Country reg6 = new Country( "England", points6, city8);
        reg6.addCity(city8);
        

        LinkedList< Point > points7 = new LinkedList< Point >();    
        points7.add( new Point( 570.0, 580.0  ) );
        points7.add( new Point( 570.0, 670.0  ) );
        points7.add( new Point( 430.0, 770.0  ) );
        points7.add( new Point( 710.0, 670.0 ) );


        Country reg7 = new Country( "Denmark", points7, city9);
        reg7.addCity(city9);
        
        LinkedList< Point > points8 = new LinkedList< Point >();    
        points8.add( new Point( 710.0, 770.0  ) );
        points8.add( new Point( 710.0, 860.0 ) );
        points8.add( new Point( 850.0, 770.0 ) );


        Country reg8 = new Country( "Italy", points8, city10 );
        reg8.addCity(city10);

        LinkedList< Point > points9 = new LinkedList< Point >();   
        points9.add( new Point( 710.0, 770.0  ) );
        points9.add( new Point( 850.0, 670.0 ) );
        points9.add( new Point( 990.0, 770.0  ) );


        Country reg9 = new Country( "Sweden", points9, city12);
        reg9.addCity(city11);
        reg9.addCity(city12);

        LinkedList< Point > points10 = new LinkedList< Point >();   
        points10.add( new Point( 430.0, 860.0 ) );
        points10.add( new Point( 570.0, 960.0  ) );
        points10.add( new Point( 710.0, 960.0  ) );
        points10.add( new Point( 570.0, 860.0  ) );


        Country reg10 = new Country( "Luxemb", points10, city14 );
        reg10.addCity(city13);
        reg10.addCity(city14);

        LinkedList< Point > points11 = new LinkedList< Point >();    
        points11.add( new Point( 10.0, 580.0  ) );
        points11.add( new Point( 10.0, 670.0 ) );
        points11.add( new Point( 150.0, 770.0  ) );
        points11.add( new Point( 430.0, 860.0 ) );
        points11.add( new Point( 570.0, 860.0 ) );
        points11.add( new Point( 710.0, 670.0 ) );
        points11.add( new Point( 430.0, 770.0  ) );
        points11.add( new Point( 150.0, 580.0  ) );

        
        Country reg11 = new Country( "Bulgaria", points11, city15);
        
        reg11.addCity(city15);
        reg11.addCity(city16);
        
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
        
        Continent cont1 = new Continent( listreg1 );              
        Continent cont2 = new Continent( listreg2 );                
        Continent cont3 = new Continent( listreg3 );                
        LinkedList<Continent> listconts = new LinkedList<Continent>();
        listconts.add(cont1);
        listconts.add(cont2);
        listconts.add(cont3);
        
        myWorld = new World( listconts );                           
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

