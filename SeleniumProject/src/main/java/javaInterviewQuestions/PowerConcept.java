package javaInterviewQuestions;

public class PowerConcept {

	public static void main(String[] args) {
		
		// there is a class math in java with that we can directly get the power of numbers by using function math.pow(base , exponent)
		System.out.println(Math.pow( 2, 4));
		 
		int base = 3;
		int exponent = 5;
		 getPower(base, exponent);
	}
	
	public static void getPower(int base , int exponent) {
		long result =1;
		while(exponent !=0) {
			result = result * base;
			exponent--;
		}
		System.out.println(result);
	}

}