package javaInterviewQuestions;

public class Quotient_Remainder {

	public static void main(String[] args) {
		 int a= 100;
		 int b=4;
		 
		int quotient = a/b;
        int remainder = a%b;
        System.out.println(quotient);
        System.out.println(remainder);
        
        Quo_Rem(25, 6);
	}
	
	public static void Quo_Rem(int i , int j) {
		int quotient = i/j;
		int remainder = i % j;
		System.out.println("Quotient is  " +quotient);
        System.out.println("Remainder is  "  +remainder);
		
	}

}
