/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codedemo;

/**
 *
 * @author DELL
 */
class LinkedStack {
    private class Node {
        int data;
        Node next;
        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    private Node top;

    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int result = top.data;
        top = top.next;
        return result;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

