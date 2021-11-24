import java.util.LinkedList;
import java.awt.*;

public class MyMap extends javax.swing.JPanel {
    private World myWorld;

    public MyMap() {
        initComponents();
        City city1 = new City( 150.0, 200.0, 100 ,"Madrid");
        City city2 = new City( 150.0, 100.0, 50, "BCN" );
        City city3 = new City( 200.0, 310.0, 500,"Sevilla"  );
        City city4 = new City( 290.0, 160.0, 500 , "Malaga" );
        City city5 = new City( 430.0, 310.0,700 , "Cadiz" );
        City city6 = new City( 710.0, 340.0,50 ,  "Zgz");
        City city7 = new City( 710.0, 290.0, 613, "Teruel" );
        City city8 = new City( 859.0, 480.0, 70,  "Mallorca");
        City city9 = new City( 460.0, 660.0,1000, "Vic" );
        City city10 = new City( 720.0, 610.0, 900, "Vigo" );
        City city11 = new City( 620.0, 600.0, 400, "Huesca" );
        City city12 = new City( 600.0, 670.0, 800, "Cuenca" );
        City city13 = new City( 300.0, 600.0, 600,  "Olot");
        City city14 = new City( 330.0, 590.0, 800,  "Leon");
        City city15 = new City( 60.0, 330.0, 700,  "Bilbao");
        City city16 = new City( 60.0, 360.0,500 ,  "Pals");
        
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
        points2.add( new Point( 420.0, 290.0   ) );
        points2.add( new Point( 360.0, 440.0 ) );
        points2.add( new Point( 220.0, 440.0  ) );

        Country reg2 = new Country( "France", points2, city3);
        reg2.addCity(city3);
 
        LinkedList< Point > points3 = new LinkedList< Point >();   
        
        points3.add( new Point( 290.0, 100.0 ) );
        points3.add( new Point( 409.0, 10.0 ) );
        points3.add( new Point( 549.0, 100.0  ) );
        points3.add( new Point( 549.0, 200.0 ) );
        points3.add( new Point( 420.0 ,290.0 ) );
        points3.add( new Point( 290.0, 200.0  ) );

        Country reg3 = new Country( "Portugal", points3, city4);
        reg3.addCity(city4);

        LinkedList< Point > points4 = new LinkedList< Point >();    
        points4.add( new Point( 549.0, 200.0  ) );
        points4.add( new Point( 420.0, 290.0  ) );
        points4.add( new Point( 360.0, 440.0 ) );
        
        

        Country reg4 = new Country( "Germany", points4, city5 );
        reg4.addCity(city5);

        //REG 5
        LinkedList< Point > points5 = new LinkedList< Point >();    
        points5.add( new Point( 549.0, 200.0  ) );
        points5.add( new Point( 360.0, 440.0 ) );
        points5.add( new Point( 710.0, 480.0  ) );
        points5.add( new Point( 850.0, 290.0  ) );
        points5.add( new Point( 850.0, 290.0  ) );
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
        points7.add( new Point( 540.0, 670.0  ) );
        points7.add( new Point( 430.0, 670.0  ) );
        points7.add( new Point( 430.0, 580.0 ) );
        points7.add( new Point( 470.0, 480.0  ) );


        Country reg7 = new Country( "Denmark", points7, city9);
        reg7.addCity(city9);
        
        LinkedList< Point > points8 = new LinkedList< Point >();    
        points8.add( new Point( 710.0, 570.0  ) );
        points8.add( new Point( 710.0, 660.0 ) );
        points8.add( new Point( 850.0, 640.0 ) );


        Country reg8 = new Country( "Italy", points8, city10 );
        reg8.addCity(city10);

        LinkedList< Point > points9 = new LinkedList< Point >(); 
        points9.add( new Point( 570.0, 580.0  ) );
        points9.add( new Point( 540.0, 670.0  ) );
        points9.add( new Point( 710.0, 700.0  ) );
        points9.add( new Point( 710.0, 570.0 ) );
        
        


        Country reg9 = new Country( "Sweden", points9, city12);
        reg9.addCity(city11);
        reg9.addCity(city12);

        LinkedList< Point > points10 = new LinkedList< Point >();   
        points10.add( new Point( 430.0, 670.0 ) );
        points10.add( new Point( 430.0, 569.0  ) );
        points10.add( new Point( 170.0, 580.0  ) );
        points10.add( new Point( 140.0, 690.0  ) );


        Country reg10 = new Country( "Luxemb", points10, city14 );
        reg10.addCity(city13);
        reg10.addCity(city14);

        LinkedList< Point > points11 = new LinkedList< Point >();    
        points11.add( new Point( 140.0, 490.0  ) );
        points11.add( new Point( 150.0, 480.0 ) );
        points11.add( new Point( 150.0, 330.0  ) );
        points11.add( new Point( 140.0, 320.0 ) );
        points11.add( new Point( 20.0, 320.0 ) );
        points11.add( new Point( 10.0, 330.0 ) );
        points11.add( new Point( 10.0, 480.0  ) );
        points11.add( new Point( 20.0, 490.0  ) );

        
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

