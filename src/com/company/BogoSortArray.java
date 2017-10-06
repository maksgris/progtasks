package com.company;

import java.util.Arrays;

public class BogoSortArray {
    public static void main(String args[]) {
        int[] arr = {0, 1, 3};
        BogoSortArray now = new BogoSortArray();
        now.bogo(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void bogo(int[] arr) {
        while (!isCorrect(arr)) shuffle(arr);
    }

    private void shuffle(int[] arr) {
        int i = arr.length - 1;
        while (i > 0)
            swap(arr, i--, (int) (Math.random() * i));
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private boolean isCorrect(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1]) return false;
        return true;
    }
}