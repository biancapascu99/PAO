package com.company;

public class Maximum {
    private int number;

    public Maximum() {
        this.number = 0;
    }

    public Maximum(int number) {
        this.number = number;
    }

    public int maxim(int a) {
        if (this.number < a)
            return a;
        return this.number;
    }

    public int maxim(int a, int b) {
        Maximum MAX = new Maximum();
        MAX.number = a;
        int c;
        c = MAX.maxim(b);
        MAX.number = c;
        return MAX.maxim(number);
    }

    public int maxim(int a, int b, int c) {
        return maxim(maxim(a, b), c);
    }

    public int maxim(int a, int b, int c, int d) {
        return maxim(maxim(a, b, c), d);
    }
}
