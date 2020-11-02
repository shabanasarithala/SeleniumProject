package javaInterviewQuestions;

import java.util.Scanner;

public class JavaProgramMethods {

	public void add2num(int a, int b) {

		int sum = a + b;
		System.out.println("sum of two integers is " + sum);

	}

	public void Asciivalue(char d) {
		int ascii = d;
		System.out.println(ascii);
		int asciiNum = (int) d;
		System.out.println(asciiNum);

	}

	public void Quo_Rem(int i, int j) {
		int quotient = i / j;
		int remainder = i % j;
		System.out.println("Quotient is  " + quotient);
		System.out.println("Remainder is  " + remainder);

	}

	public void swapNum(int a, int b) {
		System.out.println("Before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("After swapping");
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	public void swapWithOutVariable(int a, int b) {

		System.out.println("Before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("After swapping");
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	public void float_product(float f1, float f2) {
		float result = f1 * f2;
		System.out.println("the product is  " + result);

	}

	public void printInteger() {
		Scanner reader = new Scanner(System.in);
		System.out.println("please eneter a number = ");
		int num = reader.nextInt();
		System.out.println("you entered number - " + num);

	}

	public void OddOREven(int num) {

		if (num % 2 == 0) {
			System.out.println(num + "  is even");
		}

		else
			System.out.println(num + "  is odd");

	}

	public void Consonant_Vowel_If(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + "  is vowel");

		}

		else
			System.out.println(ch + "  is consonant");
	}

	public void Consonant_Vowel_switchCase(char ch) {

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + "  is vowel");
			break;

		default:
			System.out.println(ch + "  is consonant");
			break;
		}
	}

	public void getFactorial(int num) {

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of " + num + " is " + factorial);

	}

	public void getFibonacci(int num) {

		int t1 = 0;
		int t2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;

		}

	}

	public void reverseNum(int num) {
		int rev = 0;
		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}

		System.out.println("reversed number is " + rev);
	}

	public void getPower(int base, int exponent) {
		long result = 1;
		while (exponent != 0) {
			result = result * base;
			exponent--;
		}
		System.out.println(result);
	}

	public static void getDigits(long num) {
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}

		System.out.println("Nummber of digits are " + count);

	}

	public void IsPalindrome(int num) {
		int rev = 0;
		int actualNum = num;
		while (num != 0) {
			int n = num % 10;
			rev = rev * 10 + n;
			num = num / 10;
		}
		System.out.println(actualNum);
		System.out.println(rev);

		if (actualNum == rev) {
			System.out.println(actualNum + "  is a palindrome");
		} else
			System.out.println(actualNum + "  is not a palindrome");

	}

	public void IsPrime(int num) {
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(num + " is a prime");
		} else
			System.out.println(num + " is not a prime");

	}

	public void getPrimes(int low, int high) {
		while (low < high) {
			boolean flag = false;

			for (int i = 2; i <= low / 2; i++) {
				if (low % 2 == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.print(low + " , ");
			}
			low++;

		}
	}

}
