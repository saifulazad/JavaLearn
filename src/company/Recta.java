package company;

/**
 * Created by Azad on 25-Mar-16.
 */
public class Recta implements Shape {


    private double wide, height;

    public Recta(double wide, double height){

        this.height = height;
        this.wide  = wide;
    }
    @Override
    public double computeArea() {
        return height*wide;
    }

    /**
     * Created by Azad on 28-Mar-16.
     */

}

