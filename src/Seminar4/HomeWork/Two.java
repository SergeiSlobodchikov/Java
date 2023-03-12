package Seminar4.HomeWork;

import java.util.LinkedList;

public class Two {
    public static void main(String[] args) {
        Two queueExample = new Two();
        queueExample.enqueue("apple");
        queueExample.enqueue("banana");
        queueExample.enqueue("orange");
        System.out.println("first: " + queueExample.first());
        System.out.println("dequeue: " + queueExample.dequeue());
        System.out.println("dequeue: " + queueExample.dequeue());
        System.out.println("first: " + queueExample.first());
    }
    private LinkedList<Object> queue = new LinkedList<>();
    public void enqueue(Object element) {
        queue.addLast(element);
    }
    public Object dequeue() {
        return queue.removeFirst();
    }
    public Object first() {
        return queue.getFirst();
    }
}
