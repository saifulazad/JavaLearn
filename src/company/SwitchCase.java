package company;

/**
 * Created by Azad on 22-Mar-16.
 */
public class SwitchCase {

    public static void main(String[] args) {

        int operand1 = 12;
        int operand2 = 123;

        /*
        Let assume
           + :  1
           - :  2
         */

        int operation = 1;

        int final_value ;

        switch (operation){

            case 1:
                final_value = operand1 + operand2;
                System.out.println(final_value);
                break;

            case 2:
                final_value = operand1 - operand2;
                System.out.println(final_value);
                break;

            default:
                System.out.println("Invalid operation");
                break;

        }

    }
}
