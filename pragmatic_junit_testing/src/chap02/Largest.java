
package chap02;

/**
 *
 * @author emaphis
 */
public class Largest {

    /**
     * Return the largest element in a list.
     *
     * @param list A list of integers
     * @return the largest number in a given list
     */
    public static int largest(int [] list) {
        int max = Integer.MIN_VALUE;
        if(list.length == 0) {
            throw new RuntimeException("Empyt list");
        }
        for (int index = 0; index < list.length; index++) {
            if (list[index] >= max) {
                max = list[index];
            }
        }
        return max;
    }
}
