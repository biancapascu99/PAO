package com.company;


import java.util.Arrays;
import java.util.List;

public class Coada {
    private int[] intArray;
    private int count;

    public Coada() {
        this.intArray = new int[100];
        this.count = 0;
    }

    public Coada(int size) {
        this.count = 0;
        this.intArray = new int[size];
    }

    public void push(int x) {
        intArray[count] = x;
        count++;
    }

    public int pop() {
        int firstElem = intArray[0];
        for (int i = 1; i < count ; i++)
            intArray[i - 1] = intArray[i];
        count--;
        return firstElem;
    }

    public boolean isEmpty() {
        if (count == 0)
            return true;

        return false;
    }

    public String toString() {

        String arrayString = count + " : ";
        for (int i = 0; i < count; i++)
            arrayString = arrayString + intArray[i] + " ";
        return arrayString;
    }
}
