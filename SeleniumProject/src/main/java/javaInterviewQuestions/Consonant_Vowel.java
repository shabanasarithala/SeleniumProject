package javaInterviewQuestions;

public class Consonant_Vowel {

	public static void main(String[] args) {
		 
		
		char ch = 'j';
		
		if( ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
			System.out.println(ch + "  is vowel");
			
		}
		
		else
			System.out.println(ch+ "  is consonant");
		
		
		
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
		
	/*	Consonant_Vowel( 'w');
		Consonant_Vowel_switchCase( 'e');
*/
	}
	
	public static void Consonant_Vowel_If(char ch) {
		
		if( ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ) {
			System.out.println(ch + "  is vowel");
			
		}
		
		else
			System.out.println(ch+ "  is consonant");
	}
	
	public static void Consonant_Vowel_switchCase(char ch) {
		
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

}
