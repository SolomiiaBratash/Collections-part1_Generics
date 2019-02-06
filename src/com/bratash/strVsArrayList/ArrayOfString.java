package com.bratash.strVsArrayList;

public class ArrayOfString<T> {
    private final int INIT_SIZE = 2;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length+1);
        array[pointer++] = item;
    }

    public int size() {
        return pointer;
    }

     private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
