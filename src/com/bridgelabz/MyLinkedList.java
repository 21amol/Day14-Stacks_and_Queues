package com.bridgelabz;

public class MyLinkedList {
    INode head;
    INode tail;

    public void push(int data) {
        INode newNode = new INode(data);

        if (head == null) {
            //   System.out.println("Linked list is Empty");
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("Linked list is Empty.");
        } else {
            INode temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }


}