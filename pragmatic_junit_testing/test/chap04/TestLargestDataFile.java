
package chap04;

import chap02.Largest;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import junit.framework.TestCase;

/**
 * Read test data from a file
 * @author emaphis
 */
public class TestLargestDataFile extends TestCase {

    public TestLargestDataFile(String testName) {
        super(testName);
    }

    public void testFromFile() throws Exception {
        String line;
        BufferedReader rdr = new BufferedReader(new FileReader("resource/testdata.txt"));

        while ((line = rdr.readLine()) != null) {
            if (line.startsWith("#")) {  // ignore comments
                continue;
            }
            StringTokenizer st = new StringTokenizer(line);
            if (!st.hasMoreTokens()) {
                continue;  // blank line
            }
            // Get the expected value
            String val = st.nextToken();
            int expected = Integer.valueOf(val).intValue();
            // And the arguments to Largest
            ArrayList<Integer> argument_list = new ArrayList<>();
            while (st.hasMoreElements()) {
                argument_list.add(Integer.valueOf(st.nextToken()));
            }
            // Transfer object list into native array
            int[] arguments = new int[argument_list.size()];
            for (int i = 0; i < argument_list.size(); i++) {
                arguments[i] = argument_list.get(i).intValue();
            }

            // now run the assert
            assertEquals(expected, Largest.largest(arguments));
        }
    }
}
