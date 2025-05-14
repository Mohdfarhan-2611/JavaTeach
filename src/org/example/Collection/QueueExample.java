package org.example.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(20);
        queue1.add(20);
        queue1.add(10);
        queue1.add(30);

        System.out.println("PriorityQueue: "+queue1);
        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1.peek());

        System.out.println("PriorityQueue: "+queue1);

    }
}
