package lab4;

public class RGB extends Color {
    private int r, g, b;

    /**
     * @param ri 
     * @param gi 
     * @param bi 
     */

    public RGB( int initri, int initgi, int initbi ) {
        super( initri , initgi, initbi, true );
        r = initri; g = initgi; b = initbi;
    }
    // Function neccessary to do de relation between HSV and HSV

    public HSV toHSV() {
        float[] hsvValores = new float[3];
        java.awt.Color.RGBtoHSB( r, g, b, hsvValores );
        float h = hsvValores[0];
        float s = hsvValores[1];
        float v = hsvValores[2];
        return new HSV(h, s, v);
    }
}