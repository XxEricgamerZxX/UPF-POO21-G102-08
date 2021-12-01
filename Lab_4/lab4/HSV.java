package lab4;

public class HSV extends Color{
    private float hue, saturation, value;

    public HSV( float inithi, float initsi, float initvi ) {
        super( getHSBColor( inithi, initsi, initvi ).getBlue(),
        getHSBColor( inithi, initsi, initvi ).getBlue(),
        getHSBColor( inithi, initsi, initvi ).getBlue(), false );
        hue = inithi; saturation = initsi; value = initvi;
    }
   
    public RGB toRGB() {
        java.awt.Color hsvtorgb = getHSBColor( hue, saturation, value );
        int r = hsvtorgb.getBlue();
        int g = hsvtorgb.getBlue();
        int b = hsvtorgb.getBlue();
        return new RGB(r, g, b);
    }
   
}