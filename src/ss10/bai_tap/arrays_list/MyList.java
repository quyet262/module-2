package ss10.bai_tap.arrays_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void changeTheSize() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(E e) {
        if (size == elements.length) {
            changeTheSize();
        }
        elements[size++] = e;
    }
    public void add(int index, E e) {
        checkIndex(index);
        changeTheSize();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }
    public int size() {
        return this.size;
    }
    public MyList<E> cloned(){
        MyList<E> clone = new MyList<>(elements.length);
        clone.size = this.size;
        System.arraycopy(elements, 0, clone.elements, 0, size);
        return clone;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
    public boolean checkAdd(E e){
        changeTheSize();
        elements[size++] = e;
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }
    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public E edit(int index, E e) {
        checkIndex(index);
        E old = (E) elements[index];
        elements[index] = e;
        return old;
    }


    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
