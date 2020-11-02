package javaInterviewQuestions;

public class Even_Odd {

	public static void main(String[] args) {
		 
		int num = 8;
		
		if(num % 2==0) {
			System.out.println(num + "  is even");
		}
		
		else
			System.out.println(num + "  is odd");
		
		OddOREven(-85);

	}
	
	
	public static void OddOREven(int num) {
		
		if(num % 2==0) {
			System.out.println(num + "  is even");
		}
		
		else
			System.out.println(num + "  is odd");

		
	}

}
