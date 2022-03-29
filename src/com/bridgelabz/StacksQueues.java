package com.bridgelabz;

public class StacksQueues {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        System.out.println("Elements adding in stack");
        list.push(70);
        list.push(30);
        list.push(56);
        list.showList();
        list.peek();
        list.showList();
        list.pop();
        System.out.println("");
        System.out.println("Elements adding in queue.");
        list.queue(56);
        list.queue(30);
        list.queue(70);
        list.showList();
        list.dequeue();
    }
}
