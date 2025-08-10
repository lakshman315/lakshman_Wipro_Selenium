package dAY6;

import java.util.Scanner;

enum DaysOfWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public class EnumDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        String dayInput = sc.nextLine().toUpperCase();

        try 
        {
            DaysOfWeek day = DaysOfWeek.valueOf(dayInput);
            System.out.println(day + " position: " + day.ordinal());
            if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY)
                System.out.println("It's a weekend.");
            else
                System.out.println("It's a weekday.");
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid day.");
        }
        sc.close();
    }
}
