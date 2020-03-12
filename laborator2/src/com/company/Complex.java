package com.company;

public class Complex {
    double real, imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex sum(Complex c) {
        Complex suma = new Complex();
        suma.imag = this.imag + c.imag;
        suma.real = this.real + c.real;
        return suma;
    }

    public String toSting() {
        return (" " + real + " + " + imag + "i");
    }

    public boolean equals(Complex c) {
        return (this.real == c.real && this.imag == c.imag);
    }

}
