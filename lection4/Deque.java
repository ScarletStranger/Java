package lection4;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Deque {
    public static void main(String[] args) {
        //Deque иммет возможность добавления и извлечения элементов с конца
        Deque<> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.removeFirst(1);
        deque.removeLast(2);
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.pollFirst(1);
        deque.pollLast(2);
        deque.getFirst(1);
        deque.getLast(2);
        deque.peekFirst(1);
        deque.peekLast(2);
    }
}
 