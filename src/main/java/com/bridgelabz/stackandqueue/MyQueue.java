package com.bridgelabz.stackandqueue;

public class MyQueue {
    private final MyLinkedList myLinkedList ;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    public INode peek() {
        return myLinkedList.head ;

    }
}
