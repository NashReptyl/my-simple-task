package deqo.nmou.MySimpleStack;

import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     *
     */
    boolean isEmpty();

    /**
     *
     */
    int getSize();

    /**
     *
     */
    void push(Item item);

    /**
     *
     * @throws EmptyStackException
     */
    Item peek() throws EmptyStackException;

    /**
     *
     * @throws EmptyStackException
     */
    Item pop() throws EmptyStackException;
}
