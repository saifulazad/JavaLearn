package company;

/**
 * Created by Azad on 25-Mar-16.
 */
public class Square implements Shape {
    private double height;

    public Square(double height){

        this.height = height;
    }
    @Override
    public double computeArea() {
        return height*height;
    }

}
