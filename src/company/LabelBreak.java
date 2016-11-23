package company;

import java.net.URL;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




/**
 * Created by Azad on 22-Mar-16.
 */
public class LabelBreak {

    public static void main(String[] args) {


        int N= 2;
        getmeout:
        {
            for (int i = 0; i < N; ++i) {
                for (int j = i; j < N; ++j) {
                    for (int k = j; k < N; ++k) {
                        //do something here
                        System.out.println("hi");
                        break getmeout;
                    }
                }
            }

        }
        System.out.printf("%d %f %.4f", 3,Math.E,Math.E);
    }
}
