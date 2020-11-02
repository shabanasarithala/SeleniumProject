package javaInterviewQuestions;

public class NumberOfDigits {

	public static void main(String[] args) {
		 
		
		// 124455 = 6
		// 12 = 2
		
		long num = 123467;
		getDigits(num);
		
	}
	
	public static void getDigits(long num) {
int count = 0;
		
		while(num!=0) {
			num = num/10;
			count++;
		}
		
		System.out.println("Nummber of digits are "+count);
		
	}

}
