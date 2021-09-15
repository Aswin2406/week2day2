package week2day2;

public class Sumofdigitstringanothermothod {
	public static void main(String[] args) {
		String text="tes12le79af65";
		char text1;
		int sum=0;
		int length = text.length();
		for (int i = 0; i < length; i++) {
		 text1 = text.charAt(i);
		 if(Character.isDigit(text1)) {
			 int num= Character.getNumericValue(text1);
					 sum=sum+num;
			 
		 }
		}
		System.out.println(sum);
	}

}
