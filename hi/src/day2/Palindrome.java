package day2;

public class Palindrome {

	public static void main(String[] args) {
		String myString = "bye";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data))
	      {
	         System.out.println("Given String is palindrome");
	      }
	      else
	      {
	         System.out.println("Given String is not palindrome");
	      }
	      System.out.println("checked today");
		
		

	}

}
