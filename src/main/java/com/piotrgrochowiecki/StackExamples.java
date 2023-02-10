package com.piotrgrochowiecki;

import java.util.*;

public class StackExamples {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.push("first request");
        stack.push("second request");
        stack.push("third request");

        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        stack.poll();
        System.out.println(stack);
    }

}
