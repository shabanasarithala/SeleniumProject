package javaInterviewQuestions;

public class LeapYear {

	public static void main(String[] args) {
		 
		/*leap year is perfectly divisible by 4
		and if it is century year it should be perfectly divisible by 4 , 100 ,400
*/
		
		
		 int year = 2016;
		 boolean leap = false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap = true;
					
				}
				else {
					leap = false;
				}
			}
			
			else {
				leap = true;
			}
		}
		
		else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year + "  is leapyear");
		}
		
		else {
			System.out.println(year + "  is not a leap year");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
