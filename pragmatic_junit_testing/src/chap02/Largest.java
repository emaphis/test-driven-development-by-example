
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
        for (int index = 0; index <= list.length - 1; index++) {
            if (list[index] >= max) {
                max = list[index];
            }
        }
        return max;
    }
}
