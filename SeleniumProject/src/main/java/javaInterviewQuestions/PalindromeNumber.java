package javaInterviewQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		 
		
		int num = 5050;
		IsPalindrome(num);
		
			

	}
	
	public static void IsPalindrome(int num) {
		int rev = 0;
		int actualNum = num;
		while(num!=0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println(actualNum);
		System.out.println(rev);
		
		
		if(actualNum==rev) {
			System.out.println(actualNum + "  is a palindrome");
		}
		else
			System.out.println(actualNum + "  is not a palindrome");
		
	}

}
