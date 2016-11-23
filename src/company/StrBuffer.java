package company;

/**
 * Created by Azad on 24-Mar-16.
 */
public class StrBuffer {
    public static void main(String[] args) {

        String str = ". His weight is ";
        StringBuffer stringBuffer = new StringBuffer("Azad");


        stringBuffer.append(25);

        stringBuffer.append(" years old");

        stringBuffer.append(str);

        stringBuffer.append(58.5);

       

        stringBuffer.insert(4," is ");

        char [] a = new char[14];
        stringBuffer.getChars(0,14,a,0);

        System.out.println(stringBuffer);

        System.out.println(a);

    }
}
