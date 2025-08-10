package day8;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase().replaceAll("[^a-z0-9]", ""); // normalize

        Deque<Character> deque = new LinkedList<>();

        for (char ch : input.toCharArray())
        {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) 
        {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) 
        {
            System.out.println("Palindrome");
        } 
        else 
        {
            System.out.println("Not a palindrome");
        }

        sc.close();
    }
}
