package day8;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) 
        {
            stack.push(input.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty())
        {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed string: " + reversed.toString());

        sc.close();
    }
}
