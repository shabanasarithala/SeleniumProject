package javaInterviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		 
		int num = 12234;
		reverseNum(num);
		
		
	 
		
	}
	
	public static void reverseNum(int num) {
		int rev = 0;
		while(num != 0) {
			int n = num % 10;
			rev = rev*10 + n;
			num = num/10;
		}
		
		System.out.println("reversed number is " + rev );
	}

}
