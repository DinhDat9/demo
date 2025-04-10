/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codedemo;

/**
 *
 * @author DELL
 */
public class Stacktest {
    public static void main(String[] args) {
        System.out.println("Using Array Stack:");
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(10);
        arrayStack.push(20);
        System.out.println("Top: " + arrayStack.peek()); // 20
        arrayStack.pop();
        System.out.println("Size: " + arrayStack.size()); // 1

        System.out.println("\nUsing Linked List Stack:");
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(100);
        linkedStack.push(200);
        System.out.println("Top: " + linkedStack.peek()); // 200
        linkedStack.pop();
        System.out.println("Size: " + linkedStack.size()); // 1
    }
}

