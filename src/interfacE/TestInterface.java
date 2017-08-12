package interfacE;

import java.util.ArrayList;

/**
 * Created by azad on 8/12/17.
 */
public class TestInterface {
    public static void main(String[] args) {

        MobileNumberValidatorImpl mobileNumberValidator =
                new MobileNumberValidatorImpl("01676743076");

        ZipCodeValidatorImpl zipCodeValidator =
                new ZipCodeValidatorImpl("1206");

        // Interface is just a type.
        // So we can create an array of Validator.
        ArrayList<Validator> validators = new ArrayList<>();
        // this is great.
        /**
         * As mobileNumberValidator has implemented Validator interface
         * we can add it to validators array
         */
        validators.add(zipCodeValidator);
        validators.add(mobileNumberValidator);

        for (Validator eachValidator: validators){
            System.out.println(eachValidator.isValid());
        }

    }
}
