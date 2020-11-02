package javaInterviewQuestions;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		 
		int num = 200;
		int sum = 0;
		int total = 0;
		for(int i=1; i<=num; i++) {
			sum = sum +i;
			
		}
		
		System.out.println("sum of numbers is  " + sum);
		
		System.out.println("-----------------------------------");
		
		int k = 1;
		while(k<=num) {
		 total = total + k;
		 k++;
		}
		
		System.out.println(" sum of numbers is "+total);

	}

}
