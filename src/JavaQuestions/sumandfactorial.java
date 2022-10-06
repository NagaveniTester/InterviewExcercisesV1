package JavaQuestions;

import java.util.Scanner;

public class sumandfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =100;
		int sum =0;
		for(int i=0;i<=num;i++)
			sum = sum+i;
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number to find the factorial: ");
		 int fac= sc.nextInt();
		 int result=1;
		 for(int j=1;j<=fac;j++)
			 result=result*j;
		 System.out.println(result);

	}

}
