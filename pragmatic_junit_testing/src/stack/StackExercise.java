
package stack;

import java.util.EmptyStackException;

/**
 *
 * @author emaphis
 */
public interface StackExercise {

    /**
     * Return and remove the most recent item from
     * the top of the stack.
     * @return
     * @throws EmptyStackException if the stack is empty
     */
    public String pop() throws EmptyStackException;

    /**
     * Add an item to the top of the stack.
     * @param item pushed on the stack
     */
    public void push(String item);

    /**
     * Return but do not remove the most recent
     * item from the top of the stack
     * @return the tiem
     * @throws EmptyStackException
     */
    public String top()  throws EmptyStackException;

    /**
     * Returns true if the stack is empty
     * @return
     */
    public boolean isEmpty();
}
