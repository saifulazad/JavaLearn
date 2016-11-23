package company;

/**
 * Created by Azad on 22-Mar-16.
 */
public class SwitchCaseRevisited {
    /*
        vowel text
     */
    public static void main(String[] args) {


        char ch = 'b';

        switch (ch){
            case 'a':   //Either a
            case 'e':   // or e
            case 'i':   // or i
                System.out.println("Vowel");
                break;    // Each  case is terminated by berak
            default:      // Default is also a case
                System.out.println("Consonant");
                break;
        }




    }
}
