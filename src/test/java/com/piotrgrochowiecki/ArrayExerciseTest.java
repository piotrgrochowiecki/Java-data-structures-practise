package com.piotrgrochowiecki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseTest {

    ArrayExercise arrayExercise = new ArrayExercise();

    @Test
    public void testArrayToUpperCase() {
        String[] input = new String[]{"cat", "dog", "monkey"};
        arrayExercise.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "MONKEY"}, input);
    }

    @Test
    public void testIncrementArray() {
        Integer[] input = new Integer[]{4, 5, 7, 9};
        arrayExercise.incrementArray(input);
        assertArrayEquals(new Integer[]{5, 6, 8, 10}, input);
    }

}