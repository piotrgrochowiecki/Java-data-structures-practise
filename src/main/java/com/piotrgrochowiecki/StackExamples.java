package com.piotrgrochowiecki;

import java.util.*;

public class StackExamples {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        stack.poll();
        System.out.println(stack);
    }

}
