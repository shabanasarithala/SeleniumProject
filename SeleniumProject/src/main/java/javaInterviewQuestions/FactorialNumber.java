package javaInterviewQuestions;

public class FactorialNumber {

	public static void main(String[] args) {
		 
		/*!0 = 1     ( factorial of zero is always 1)
	    !5 = 5*4*3*2*1 = 120
	    !4 = 4*3*2*1 = 24*/
		
		
		int num = 5;
		 getFactorial(num);
	}
	
	public static void getFactorial(int num) {
		
		int factorial = 1;
		for(int i = 1; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("factorial of " + num + " is " + factorial);
		
	}

}
