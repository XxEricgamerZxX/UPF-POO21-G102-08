package lab4;

public class Color extends java.awt.Color {
    private double x;
    private double y; 
    private double z;
    private boolean isRGB; 

    /** Constructor method to initialize an instance of this class.
     * @param initX -> referring to RED
     * @param initY -> referring to BLUE
     * @param initZ -> referring to GREEN
     * @param initRGB -> boolean value that indicates if it's in RGB or not
     */
    public Color(double initX, double initY, double initZ, boolean initRGB){
        super( (int) initX , (int) initY, (int) initZ);
        this.x = initX;
        this.y = initY;
        this.z = initZ;
        this.isRGB = initRGB;
    }

    public void toHSV(){
        // 1) R, G, B values are divided by 255
        x = x/255;
        y = y/255;
        z = z/255;

        // 2) Compute max,min & differenceerence
        double minimum, maximum, difference;
        minimum = Math.min(x,Math.min(y,z));
        maximum = Math.max(x,Math.max(y,z));
        difference = maximum - minimum;

        // 3) Hue calculation:
        double hue = -1;
        if(maximum == 0 & minimum == 0){
            hue = 0;
        } else if(maximum == x){
            hue = (60 * ((z-y) / difference) + 360) % 360;
        } else if(maximum == z){
            hue = (60 * ((y - x) / difference) + 120) % 360;
        } else if(maximum == y){
            hue = (60 * ((x - z) / difference) + 240) % 360;
        }
        
        // 4) Saturation computation:
        double saturation = -1;
        if(maximum == 0){
            saturation = 0;
        } else{
            saturation = (difference/maximum)*100;
        }
        // 5) Value computation:
        double value = maximum * 100;

        // 6) Notify the result:
        System.out.println("(Hue: " + hue + "\nSaturation: " + saturation + "\nValue: " + value + ")");
        isRGB = false; // since now our data is iin HSV
    }
    public void toRGB(){
        isRGB = true;
    }
}
