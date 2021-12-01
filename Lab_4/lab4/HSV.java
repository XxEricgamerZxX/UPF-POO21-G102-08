package lab4;

public class HSV extends Color{
    private float h, s, v;

    public HSV( float inithi, float initsi, float initvi ) {
        super( getHSBColor( inithi, initsi, initvi ).getBlue(),
        getHSBColor( inithi, initsi, initvi ).getBlue(),
        getHSBColor( inithi, initsi, initvi ).getBlue(), false );
        h = inithi; s = initsi; v = initvi;
    }
   
    public RGB toRGB() {
        java.awt.Color hsvtorgb = getHSBColor( h, s, v );
        int r = hsvtorgb.getBlue();
        int g = hsvtorgb.getBlue();
        int b = hsvtorgb.getBlue();
        return new RGB(r, g, b);
    }
   
}