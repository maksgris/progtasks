package com.company;

public class Fibona4i {

    public static void main(String args[]) {
        Integer f = 1;
        Integer s = 1;
        Integer p = 0;
        System.out.print(f);
        for (Integer i = 1; s < 500; i = i + 1) {
            System.out.print(" ");
            System.out.print(s);
            p = s;
            s = s + f;
            f = p;
        }
    }
}