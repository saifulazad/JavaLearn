package assertion;

/**
 * Created by Azad on 23-Apr-16.
 */

/**
 * Assertion :
 * Helps to find out uncertain flow of code execution
 *
 * Unlike Exceptions , assertion can be enabled / disabled by
 * VM option
 *
 * 
 */
class Assertion{
    public void run(){

        int x = -1;
        assert x >=0: "X value is negative";
    }
}
public class Assert {

    public static void main(String[] args) {
        Assertion assertion = new Assertion();

        assertion.run();
    }

}
