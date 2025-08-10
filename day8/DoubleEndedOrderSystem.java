package day8;

import java.util.Deque;
import java.util.LinkedList;

public class DoubleEndedOrderSystem 
{
    public static void main(String[] args) 
    {
        Deque<String> orders = new LinkedList<>();

        orders.addFirst("Order1"); 
        System.out.println("After adding Order1 at front: " + orders);

        orders.addLast("Order2");
        System.out.println("After adding Order2 at rear: " + orders);

        orders.addFirst("Order3");
        System.out.println("After adding Order3 at front: " + orders);

        orders.addLast("Order4");
        System.out.println("After adding Order4 at rear: " + orders);

        orders.removeFirst();
        System.out.println("After removing from front: " + orders);

        orders.removeLast();
        System.out.println("After removing from rear: " + orders);

        orders.removeFirst();
        System.out.println("After removing from front: " + orders);

        orders.removeLast();
        System.out.println("After removing from rear: " + orders);
    }
}
