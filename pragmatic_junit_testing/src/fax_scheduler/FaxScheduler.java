package fax_scheduler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author emaphis
 */
public class FaxScheduler {

    /**
     * Send the named file as a fax to the given phone number.
     * @param phone
     * @param filename
     * @return
     */
    public boolean sendFax(String phone,  String filename)
            throws MissingOrBadFileException, PhoneFormatException, PhoneAreaCodeException {

        BufferedReader rdr = openFile(filename);

        if (!isValidPhoneNumber(phone)) {
            throw new PhoneFormatException();
        }
        if (!isValidAreaCode(phone)) {
            throw new PhoneAreaCodeException();
        }

        return true;
    }

    public BufferedReader openFile(String fileName) throws MissingOrBadFileException {
        BufferedReader rdr = null;
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new MissingOrBadFileException();
        }
    }

    /**
     *  Validate phone number according to the pattern:
     * -  xnn-nnn-nnnn where x = 2-9, n = 0-9
     * @param phoneNumber to validate
     * @return true if phone number is valid
     */
    public boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[2-9]\\d{2}-\\d{3}-\\d{4}");
    }

    /**
     * Validate area code of phone number using patterns
     * x11, x9n, 37n, 96n as reserved blocks
     * @param phoneNumber to validate
     * @return true if area code of phone number is valid.
     */
    public boolean isValidAreaCode(String phoneNumber) {
        String acode = phoneNumber.substring(0, 3);
        // reserved blocks
        String block1 = "\\d11";
        String block2 = "\\d9\\d";
        String block3 = "96\\d";

        return !(acode.matches(block1) || acode.matches(block2) || acode.matches(block3));
    }
}
