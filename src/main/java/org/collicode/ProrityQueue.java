package org.collicode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProrityQueue {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(4.5);
        queue.offer(5.6);
        queue.offer(3.2);
        while (queue.isEmpty()){
            System.out.println(queue.poll());

        }
    }
}
