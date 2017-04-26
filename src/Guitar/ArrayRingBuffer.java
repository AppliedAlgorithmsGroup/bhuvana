package Guitar;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Created by bhuvanabellala on 2/19/17.
 */
public class ArrayRingBuffer<E> extends AbstractBoundedQueue<E> {

    private E[] string;
    private int first;
    private int last;

    public ArrayRingBuffer(int cap){

        capacity = cap;
        fillCount = 0;
        first = cap/2;
        last = cap/2;
        string = (E[]) new Object[cap];
    }


    @Override
    public E peek() {
        return string[first];
    }

    @Override
    public E dequeue() {
        // save item to be returned, move first pointer, wrap?
        E temp = string[first];
        fillCount = fillCount - 1;
        first = (first + 1) % string.length;
        // return saved element
        return temp;
    }

    @Override
    public void enqueue(E x) {

        string[last] = x;
        fillCount = fillCount + 1;
        last = (last + 1) % string.length;

    }

    public Iterator<E> iterator(){
        return new stringIterator();
    }


    private class stringIterator implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
