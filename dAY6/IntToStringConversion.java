package dAY6;

public class IntToStringConversion {
    public static void main(String[] args) 
    {
        int number = 12345; 

        String str = String.valueOf(number);
        System.out.println("Converted int to String: " + str);

        try 
        {
            int parsedNumber = Integer.parseInt(str);
            System.out.println("Converted String back to int: " + parsedNumber);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: The string is not a valid integer.");
        }
          
    }
}
