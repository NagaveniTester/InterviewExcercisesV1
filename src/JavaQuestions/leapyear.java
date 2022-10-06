package JavaQuestions;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// leap number = divisible by 4 for all the century years -- ending with00
		// century year is a leap year when its divisible by 400
		
		int year = 2000;
		boolean leap = false;
		
		
		if(year%4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
					}
				else {
					leap = false;
				}}
			else {
					leap = true;
			}
			}
		else {
				leap = false;
			}
			if(leap) {
				System.out.println("Is a leap year");
			}
			else {
				System.out.println("Is not a leap year");
			}



	}
}
