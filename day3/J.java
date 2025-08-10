package package_Strings;

public class J {

	public static void main(String[] args) {
		// Write a program to remove all white Spaces from string
		String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll(" ", "");
        System.out.println("After replacement: " + sentence);

	}

}
