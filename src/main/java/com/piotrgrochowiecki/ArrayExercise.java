package com.piotrgrochowiecki;

public class ArrayExercise {

    public void arrayToUpperCase(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toUpperCase();
        }
    }

    public void incrementArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}
