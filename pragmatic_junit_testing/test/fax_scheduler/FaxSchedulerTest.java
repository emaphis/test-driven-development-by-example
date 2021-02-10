
package fax_scheduler;

import java.io.BufferedReader;
import java.io.IOException;
import junit.framework.TestCase;

/**
 *
 * @author emaphis
 */
public class FaxSchedulerTest extends TestCase {

    public FaxSchedulerTest(String testName) {
        super(testName);
    }

    /**
     * Test of sendFax method, of class FaxScheduler.
     */

    public void testSendFax() {
        System.out.println("sendFax");
        String phone = "222-999-1111";
        String filename = "resource/testdata.txt";
        FaxScheduler instance = new FaxScheduler();
        boolean expResult = true;
        boolean result = instance.sendFax(phone, filename);
        assertEquals(expResult, result);
    }

    public void testOpenFileShouldSuceedeWithRealFile() {
        String fileName = "resource/testdata.txt";
        FaxScheduler instance = new FaxScheduler();
        try {
            BufferedReader rdr = instance.openFile(fileName);
            assertTrue(rdr.ready());
        } catch (MissingOrBadFileException | IOException ex) {
            fail("File not oppened");
        }
    }


    public void testOpenFileShouldThrowExceptionOnFakeFile() {
        String fileName = "resource/blub.txt";
        FaxScheduler instance = new FaxScheduler();
        try {
            BufferedReader rdr = instance.openFile(fileName);
            fail("fale files should fail");
        } catch (MissingOrBadFileException ex) {
            assertTrue(true);
        }
    }

    /**
     * Test of isValidPhoneNumber method, of class FaxScheduler.
     */
    public void testIsValidPhoneNumber() {
        System.out.println("isValidPhoneNumber");
        FaxScheduler instance = new FaxScheduler();
        // xnn-nnn-nnnn where x = 2-9, n = 0-9
        assertTrue(instance.isValidPhoneNumber("299-999-9999"));
        assertTrue(instance.isValidPhoneNumber("255-555-5559"));
        assertTrue(instance.isValidPhoneNumber("311-111-1111"));
        assertTrue(instance.isValidPhoneNumber("900-000-0000"));

        // bad prefix
        assertFalse(instance.isValidPhoneNumber("099-999-9999"));
        assertFalse(instance.isValidPhoneNumber("199-999-9999"));

        //bad format
        assertFalse(instance.isValidPhoneNumber("299=999-9999"));
        assertFalse(instance.isValidPhoneNumber("299 999-9999"));
        assertFalse(instance.isValidPhoneNumber("299999-9999"));
        assertFalse(instance.isValidPhoneNumber("299-999+9999"));
    }

    public void testValidAreaCode() {
        System.out.println("isValidAreaCode");
        FaxScheduler instance = new FaxScheduler();
        // x11, x9n, 37n, 96n
        // x11 should fail
        assertFalse(instance.isValidAreaCode("311-999-9999"));
        assertFalse(instance.isValidAreaCode("411-999-4567"));

        // x9n should fail
        assertFalse(instance.isValidAreaCode("391-999-9999"));
        assertFalse(instance.isValidAreaCode("399-999-9999"));

        // 96n should fail
        assertFalse(instance.isValidAreaCode("961-999-9999"));
        assertFalse(instance.isValidAreaCode("969-999-9999"));

        assertTrue(instance.isValidAreaCode("919-999-9999"));
        assertTrue(instance.isValidAreaCode("222-999-1111"));
    }

}
