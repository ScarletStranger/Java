package lection4;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class fifo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(4);
        int item = queue.remove();
        // Для PriotityQueue "наименьший" элемент имеет наивысший приоритет
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(13);
        pq.add(1);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
