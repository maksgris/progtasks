package com.company;

import java.util.Arrays;
import java.util.Collections;


class RandomSort {

    public RandomSort(int[] i) {
        int counter = 0;
        System.out.println("I'll sort " + i.length + " elements...");
        while(!isSorted(i)) {
            shuffle(i);
            counter++;
        }
        System.out.println("Solution found! (shuffled " + counter + " times)");
        print(i);
    }

    private void print(int[] i) {
        for(int x : i) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    private void shuffle(int[] i) {
        for(int x = 0; x < i.length; ++x) {
            int index1 = (int) (Math.random() * i.length),
                    index2 = (int) (Math.random() * i.length);
            int a = i[index1];
            i[index1] = i[index2];
            i[index2] = a;
        }
    }

    private boolean isSorted(int[] i) {
        for(int x = 0; x < i.length - 1; ++x) {
            if(i[x] > i[x+1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] i = {1, 5, 2, 8, 5, 2, 4, 2, 6, 7, 66};
        new RandomSort(i);
    }

}