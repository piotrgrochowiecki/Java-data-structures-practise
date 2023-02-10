package com.piotrgrochowiecki;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("person one");
        queue.offer("person two");
        queue.offer("person three");

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

    }
}
