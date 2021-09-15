package week2day2;

public class ReverseString {
	public static void main(String[] args) {
		
	
	String test = "feeling good";
	
      int 	count =0;
      
      char[] charr = test.toCharArray();
      for (int i = charr.length-1; i >=0; i--) {
    	  System.out.println(charr[i]);
		
	}
      int len = test.length();
      for (int i = len-1; i >=0; i--) {
    	char character = test.charAt(i);
    	System.out.print(character);
      }
	}
}
