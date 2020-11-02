package javaInterviewQuestions;

public class LargestInThreeNumbers {

	public static void main(String[] args) {
		int a = 1000;
		int b = 100;
		int c = 1000;

		if (a > b && a > c) {
			System.out.println(" a is greatest ");
		} else if (b > c) {
			System.out.println(" b is greatest ");
		} else
			System.out.println(" c is greatest ");
		
		System.out.println("--------------------------------------------");

		if (a >= b) {
			if (a >= c) {
				System.out.println(" a is greatst ");
			} else {
				System.out.println(" z is greatest ");
			}

		}

		else {
			if (b >= c) {
				System.out.println(" b is greatest ");
			} else
				System.out.println(" c is greatest ");
		}
	}

}
