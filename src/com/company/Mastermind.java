package com.company;

import java.util.Arrays;
import java.io.DataInputStream;

import static java.lang.Math.random;

public class Mastermind {
    public static void main(String args[]) {

    }

    void correct(int[] arr) {
        String cor = "";
        for(int i = 1; i<5; i++)
            cor = cor + String.valueOf(random());
    }
}
