package com.company;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {

    }

    public Complex(double realPart, double imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex otherNumber) {
        double addedRealPart = realPart + otherNumber.realPart;
        double addedImaginaryPart = imaginaryPart + otherNumber.imaginaryPart;

        return new Complex(addedRealPart, addedImaginaryPart);
    }

    public Complex subtract(Complex otherNumber) {
        double subtracktedRealPart = realPart - otherNumber.realPart;
        double subtractedImaginaryPart = imaginaryPart - otherNumber.imaginaryPart;

        return new Complex(subtracktedRealPart, subtractedImaginaryPart);
    }

}
