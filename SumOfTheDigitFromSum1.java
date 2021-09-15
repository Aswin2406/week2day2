package week2day2;

public class SumOfTheDigitFromSum1 {
	public static void main(String[] args) {
		
		
		 String text = "Tes12Le79af65";
		 
		 
		 String replace = text.replaceAll("[\\D]", " ");
	     System.out.println("numbers from string:"+replace);
			
			char[] chararr = replace.toCharArray();
			 
			 int sum=0,add=0;
	 
			 
			for (int i = 0; i < chararr.length; i++) {
				System.out.println(chararr[i]);
			int n =	Character.getNumericValue(chararr[i]);
				sum=sum=n;
				
			}
				
		
			System.out.println(sum);
				
			}
			 
		
}
	
	
	
	

  