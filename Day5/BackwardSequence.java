package Day5;


public class BackwardSequence implements CharSequence {
 private final String reversed; 

 
 public BackwardSequence(String original) 
 {
     if (original == null) 
     {
         throw new IllegalArgumentException("Input string cannot be null");
     }
     this.reversed = new StringBuilder(original).reverse().toString();
 }

 
 public int length() {
     return reversed.length();
 }

 
 public char charAt(int index) {
     return reversed.charAt(index);
 }

 
 public CharSequence subSequence(int start, int end) {
     return reversed.subSequence(start, end);
 }

 
 public String toString() {
     return reversed;
 }


 public static void main(String[] args) {
     BackwardSequence bs = new BackwardSequence("hello");

     System.out.println("Original string: hello" );
     
     System.out.println("Reversed string: " + bs);

     System.out.println("Length: " + bs.length());

     System.out.println("Char at index 1: " + bs.charAt(2));

     System.out.println("Subsequence (1,4): " + bs.subSequence(1, 3));
 }
}
