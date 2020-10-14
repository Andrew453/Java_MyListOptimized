package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyList<T> implements Collection<T> {
    class Node<T> {
        private T value;
        private Node<T> node;

        public Node(T value) {
            this.value = value;
            this.node = null;
        }

        public boolean hasNext() {
            if(this.node != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String toString() {
            return value.toString();
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNode() {
            return node;
        }

        public void setNode(Node<T> node) {
            this.node = node;
        }

    }
    private Node<T> root;
    private long counter;
    private Comparable comp;
    public MyList() {
        this.root = null;
        this.counter = 0;
    }

    public MyList(Comparable comp) {
        this.root = null;
        this.counter = 0;
        this.comp = comp;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return (this.root == null ? true : false);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return false;
    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Stream<T> stream() {
        return null;
    }

    @Override
    public Stream<T> parallelStream() {
        return null;
    }
}

interface Comparable {
    int compare(MyList.Node a, MyList.Node b);
}
