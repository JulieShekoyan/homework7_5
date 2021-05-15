package com.company;

public class Main {

    public static void main(String[] args) {
        Complex complex = new Complex(6, 7);

        Complex complex1 = new Complex(4, 2);

        Complex addedComplexes = complex.add(complex1);

        Complex subtracktedComplexes = complex.subtract(complex1);

        System.out.println("The sum is " + addedComplexes.getRealPart() + " + " + addedComplexes.getImaginaryPart() + "i");
        System.out.println("The subtraction is " + subtracktedComplexes.getRealPart() + " + " + subtracktedComplexes.getImaginaryPart() + "i");

    }
}
