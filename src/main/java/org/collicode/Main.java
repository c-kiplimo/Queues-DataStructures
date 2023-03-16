package org.collicode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Steve");
        queue.offer("Harold");
        //System.out.println(queue.peek()) ;//Picks the first element
        queue.poll(); //dequeue removes the first element since it works using the concept of FIFO
//        queue.poll();
//        queue.poll();
        //it will cause an exception
//        queue.element();
        System.out.println(queue.contains("Harold"));
        System.out.println(queue.size());
        System.out.println(queue);
    }
}