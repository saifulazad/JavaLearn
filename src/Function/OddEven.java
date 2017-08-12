package Function;


/**
 * Created by Azad on 4/5/2016.
 */
public class OddEven {
    /**
     * This is our 3rd function declaration and definition
     * having 1 parameter and return type
     *
     *
     * return_type   boolean
     * function_name isODD
     * parameter list :  val that means (String val)
     */
    static boolean isODD(int val){
        /**
         * This function check whether
         * an integer even or odd
         * even 0 ,2, 10
         * odd 1, 5, 7
         */
        if ( val %2 ==0){
            return false;  // return boolean type data
        }
        else {
            return true; // return boolean type data
        }
    }
    public static void main(String [] args){


        /**
         * call that function from main
         * by isODD(12) hence
         * isODD has 1 parameter,
         * we call it with 1
         * argument

         * isODD(12) will return a boolean type
         * data so receive it by a boolean type
         * var (so here x is boolean)
         */
        boolean x = isODD(12);
        System.out.println(x);
        /**
         * this will not compile
         * type miss matched r is
         * integer but isODD(12) will
         * return a boolean type
         */
        //int r = isODD(12);

    }
}
