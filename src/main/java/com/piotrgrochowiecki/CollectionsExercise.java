package com.piotrgrochowiecki;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsExercise {

    public void addToEndOfLinkedList(LinkedList<Integer> numbers, int i){
        numbers.add(i);
    }

    public void addZeroToStartOfLinkedList(LinkedList<Integer> numbers) {
        numbers.addFirst(0);
    }

    public void removeItemFromTopOfStack(ArrayDeque<Integer> numbers) {
        numbers.removeFirst();
    }

    public void addItemToTreeSet(TreeSet<String> words, String wordToBeAdded) {
        words.add(wordToBeAdded);
    }

}
