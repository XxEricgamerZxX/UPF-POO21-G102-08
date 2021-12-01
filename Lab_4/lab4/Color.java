package lab4;

abstract public class Color extends java.awt.Color {
    protected double x;
    protected double y; 
    protected double z;
    protected boolean isRGB; 

    public Color(double initX, double initY, double initZ, boolean initRGB){
        super( (int) initX , (int) initY, (int) initZ);
        x = initX;
        y = initY;
        z = initZ;
        isRGB = initRGB;
    }

}
