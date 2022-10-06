package JavaQuestions;

import java.util.Scanner;

public class numPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,temp,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check the Palindrome: ");
		int orignum = sc.nextInt();
		temp = orignum;
		while(orignum>0)
		{
			r = orignum%10;
			sum = (sum*10)+r;
			orignum=orignum/10;
		}
		if(temp == sum)
			System.out.println("Is Palindrome");
		else
			System.out.println("Not Palindrome");
		
		//String Palindrome
		
		String str= "Malayalam";
		String rev="";
		for(int i= str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str))
			System.out.println("Is Palindrome");
		else
			System.out.println("Not a Palindrome");
					
	}

}
