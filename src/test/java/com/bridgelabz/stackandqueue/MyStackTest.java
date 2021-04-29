package com.bridgelabz.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    //UC1 Ability to create a Stack
    @Test
    public void given3Number_WhenAddedToStack_ShouldHaveLastAddedNodeAtTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();

        INode peek;
        peek = myStack.peek();
        Assert.assertEquals(myThirdNode, peek);
    }

    @Test
    public void given3NumberInStack_WhenPopped_ShouldReturnEmpty() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();

        myStack.pop();
        myStack.pop();
        myStack.pop();

        INode peek;
        peek = myStack.peek();
        Assert.assertEquals(null, peek);
    }
}