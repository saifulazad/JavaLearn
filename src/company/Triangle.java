package company;

/**
 * Created by Azad on 25-Mar-16.
 */
public class Triangle  implements Shape {

    double base, height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double computeArea() {
        return .5*base*height;
    }
}
