package company;

/**
 * Created by Azad on 25-Mar-16.
 */
public class Base {

    public static void main(String args[]){

        Shape square = new Square(21);

        Shape rectan = new Recta(12,13);

        Shape Triangle = new Triangle(12,14);

        System.out.println(square.computeArea());
        System.out.println(rectan.computeArea());
        System.out.println(Triangle.computeArea());
    }
}
