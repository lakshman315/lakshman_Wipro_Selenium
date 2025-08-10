package package_Strings;
import java.util.Arrays;
public class L {

	public static void main(String[] args) {
		// Write a program to sort characters of a String Alphabetically 
		
		        String s = "geeksforgeeks";
		        
		        // Convert the string to a character array
		        char[] arr = s.toCharArray();

		        // Sort the character array
		        Arrays.sort(arr);

		        // Convert sorted character array back to string
		        s = new String(arr);

		        // Print the sorted string
		        System.out.print(s);
		    }
		}

	


