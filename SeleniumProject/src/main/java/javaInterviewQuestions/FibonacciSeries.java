package javaInterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		 
		// the sum of last two digits is the next number in fibonacci series
		
		int num = 10;
		 
		getFibonacci(num);	
		

	}
	
	public static void getFibonacci(int num) {
		
		int t1=0;
		int t2=1;
		for(int i = 1; i<=num; i++) {
			System.out.println(t1);
			int sum = t1+t2;
			t1 = t2;
			t2 = sum;
			
		}
		
	}

}
