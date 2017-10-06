package com.company;

public class Multiplication {

    public static void main(String args[]) {
        Integer a = 1;
        Integer b = 3;
        Integer c = 2;
        Integer D = b * b - 4 * a * c;
        if (D > 0) ;
        {
            Double x1 = -b + Math.sqrt(D);
            Double x2 = -b - Math.sqrt(D);
            System.out.print("x1 = ");
            System.out.println(x1);
            System.out.print("x2 = ");
            System.out.println(x2);
        }
    }
}
