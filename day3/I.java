package package_Strings;

public class I 
{

	public static void main(String[] args) 
	{
		//Write a program to find the frequency of each character in a string
		
		String inputString = "hello world";
		        
		 	// Create an array to hold counts for each possible character (ASCII values 0-255)
		    // Each index represents a character's ASCII value, and the value at that index
		    // will store how many times that character appears in the string.
		int[] counts = new int[256]; 

		    // Loop through each character in the string
		for (char character : inputString.toCharArray()) 
		{ 
		    // Convert the character to its ASCII value (which is an integer)
			// and use it as an index to increment the count in the 'counts' array.
			// For example, if 'h' is the character, its ASCII value (e.g., 104) 
			// will be used as the index, so counts[104] will be incremented.
			counts[character]++; 
		}

		        // Now, print out the characters and their frequencies
		System.out.println("Character frequencies:");
		for (int i = 0; i < counts.length; i++) 
		{
		            // Check if the count for this character is greater than 0
		            // This means the character actually appeared in the string.
			if (counts[i] > 0) 
			{
		                // Cast the index (ASCII value) back to a character to display it
		                // and print its frequency (the value at that index in the counts array).
		                System.out.println("Character '" + (char) i + "' appears " + counts[i] + " times");
			}
		}
	}
}


	


