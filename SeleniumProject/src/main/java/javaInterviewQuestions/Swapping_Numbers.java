package javaInterviewQuestions;

public class Swapping_Numbers {

	public static void main(String[] args) {
		/*int a = 10;
		int b= 20;*/
		
		// with third variable
		
		/*System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After swapping");
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);*/
		
	//	without third variable
		
		/*System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After swapping");
		a=a-b;
		b=a+b;
		a =b-a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		*/
		
		
		swapNum(20, 40);
		swapWithOutVariable( 5, 25);
		
		
	}
	
	
	public static void swapNum(int a , int b) {
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After swapping");
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	
	public static void swapWithOutVariable(int a , int b) {
		
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After swapping");
		a=a-b;
		b=a+b;
		a =b-a;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
}
