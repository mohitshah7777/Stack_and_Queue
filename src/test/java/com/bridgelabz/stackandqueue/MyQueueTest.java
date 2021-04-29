package com.bridgelabz.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {

    //UC3 Ability to create a Queue
    @Test
    public void given3Number_WhenAddedToQueue_ShouldHaveFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        INode peek;
        peek = myQueue.peek();
        Assert.assertEquals(myFirstNode, peek);
    }
}