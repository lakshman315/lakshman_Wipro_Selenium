package day8;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) 
    {
       
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing 5 elements: " + stack);

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        int topElement = stack.peek();
        System.out.println("Current top element (peek): " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}

