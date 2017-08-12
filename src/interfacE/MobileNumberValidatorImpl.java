package interfacE;

/**
 * Created by azad on 8/12/17.
 */

/**
 * MobileNumberValidatorImpl implements Validator. As {@link MobileNumberValidatorImpl}
 * is a concrete class it must implement all of Validator class's methods.
 */
public class MobileNumberValidatorImpl implements Validator {
    private String value;

    public static final int BD_MOBILE_LENGTH = 11;

    MobileNumberValidatorImpl(String value) {
        this.value = value;
    }

    /**
     * Here is most tricky part. We can implement this method as per our class
     * requirements. Mobile no in BD must be 11 in length.
     *
     * @return
     */
    @Override
    public boolean isValid() {
        if (value == null) {
            throw new NullPointerException("Value can not be null");
        }
        if (value.length() != BD_MOBILE_LENGTH) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("Mobile Number is %s", this.value);
    }
}
