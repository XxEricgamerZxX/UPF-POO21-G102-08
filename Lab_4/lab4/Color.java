package lab4;

public class Color {
    private double x; 
    private double y; 
    private double z;
    private boolean isRGB; 

    // CONSTRUCTOR
    public Color(double initX, double initY, double initZ, boolean initRGB){
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

        // 2) Compute max,min & difference
        double minimum, maximum, diff;
        minimum = Math.min(x,Math.min(y,z));
        maximum = Math.max(x,Math.max(y,z));
        diff = maximum - minimum;

        // 3) Hue calculation:
        double hue = 0.0;
        if(maximum == 0 & minimum == 0){
            hue = 0;
        } else if(maximum == x){
            // geeks of geeks double hue = (60 * ((g – b) / diff) + 360) % 360;
            hue = (y-z)/(maximum-minimum);
        } else if(maximum == y){
            // geeks of geeks double hue = (60 * ((b – r) / diff) + 120) % 360
            hue = 2 + (z-x)/(maximum-minimum);
        } else if(maximum == z){
            // geeks of geeks double hue = (60 * ((r – g) / diff) + 240) % 360
            hue = 4 + (x-y)/(maximum-minimum);
        }
        hue *= 60.0;
        if (hue > 0){
            hue = hue;
        } else {
            hue = 360 - hue;
        }
        
        // 4) Saturation computation:
        if(maximum == 0){
            double saturation = 0;
        } else{
            double saturation = (diff/maximum)*100;
        }
        // 5) Value computation:
        double value = maximum * 100;
    }
    public void toRGB(){
        isRGB = true;
    }
}

