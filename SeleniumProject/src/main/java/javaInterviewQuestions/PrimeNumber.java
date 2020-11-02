package javaInterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {

		// prime number - number that is divisible by 1 and itself . example - 2 , 5 ,7
		// ,11 ,13 .....

		int num = 13;
		IsPrime(num);
		getPrimes(20, 50);

	}

	public static void IsPrime(int num) {
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

	public static void getPrimes(int low, int high) {
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
