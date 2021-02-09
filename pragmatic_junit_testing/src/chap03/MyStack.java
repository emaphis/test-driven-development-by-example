
package chap03;

import java.util.EmptyStackException;

/**
 *
 * @author emaphis
 */
public class MyStack implements StackExercise {
    // Implement as an array of Strings with a count.
    private String[] stack;
    private int count;

    public MyStack() {
        this.stack = new String[100];
        this.count = 0;
    }

    @Override
    public void push(String item) {
        if (count < 100) {
            count++;
            stack[count] = item;
        } else {
            throw new RuntimeException("Stack space is full");
        }
    }

    @Override
    public String pop() throws EmptyStackException {
        if (count == 0) throw new EmptyStackException();
        String item = stack[count];
        count--;
        return item;
    }

    /**
     * Return but do not remove the most recent
     * item from the top of the stack
     * @return the tiem
     * @throws EmptyStackException
     */
    @Override
    public String top() throws EmptyStackException {
        if (this.isEmpty()) throw new EmptyStackException();
        return stack[count];
    }

    /**
     * Returns true if the stack is empty
     * @return
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

}