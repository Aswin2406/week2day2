package week2day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		char[] str;
		String[] spt = test.split(" ");
		for (int i = 0; i < spt.length; i++) {
			
			if (i%2==1) {
				str = spt[i].toCharArray();
				
				for (int j = str.length-1; j >=0; j--) {
					System.out.print(str[j]);
					
				}
				
			}
		
			else 
				System.out.println(spt[i]);
		}
       
	}

}
