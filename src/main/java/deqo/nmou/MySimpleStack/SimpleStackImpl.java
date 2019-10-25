package deqo.nmou.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {
    /**
     *
     */
    private Stack<Object> wrappedStack = new Stack<Object>();

    /**
     *
     */
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    /**
     *
     */
    public int getSize() {
        return wrappedStack.size();
    }

    /**
     *
     * @param item
     */
    public void push (Item item) {
        wrappedStack.push(item);
    }

    /**
     *
     * @throws EmptyStackException
     */
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    /**
     *
     * @return
     * @throws EmptyStackException
     */
    public Item pop()  throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }

}
