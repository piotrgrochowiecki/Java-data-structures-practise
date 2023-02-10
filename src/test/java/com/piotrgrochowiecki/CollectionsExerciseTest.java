package com.piotrgrochowiecki;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsExerciseTest {

    CollectionsExercise collectionsExercise = new CollectionsExercise();

    @Test
    public void testAddToEndOfLinkedList() {
        LinkedList<Integer> input = new LinkedList<>();
        input.add(5332);
        input.add(67873);
        input.add(4323);

        collectionsExercise.addToEndOfLinkedList(input, 8756);
        assertEquals(8756, input.getLast());
    }

    @Test
    public void testAddZeroToStratOfLinkedList() {
        LinkedList<Integer> input = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        collectionsExercise.addZeroToStartOfLinkedList(input);
        assertEquals(0, input.getFirst());
    }

    @Test
    public void testRemoveItemFromTopOfStack() {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        collectionsExercise.removeItemFromTopOfStack(stack);
        assertEquals(Integer.valueOf(4), stack.peek());
    }

    @Test
    public void testAddItemToTreeSet() {
        TreeSet<String> set = new TreeSet<>();
        set.add("red");
        set.add("orange");
        set.add("yellow");

        collectionsExercise.addItemToTreeSet(set,"green");
        assertTrue(set.contains("green"));
    }

}