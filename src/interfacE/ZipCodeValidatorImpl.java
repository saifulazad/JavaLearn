package interfacE;

/**
 * Created by azad on 8/12/17.
 */
public class ZipCodeValidatorImpl implements Validator {

    private String value;

    public static final int BD_ZIPCODE_LENGTH = 4;

    ZipCodeValidatorImpl(String value) {
        this.value = value;
    }

    @Override
    public boolean isValid() {
        if (value == null) {
            throw new NullPointerException("Value can not be null");
        }
        if (value.length() != BD_ZIPCODE_LENGTH) {
            return false;
        }

        return true;
    }
}
