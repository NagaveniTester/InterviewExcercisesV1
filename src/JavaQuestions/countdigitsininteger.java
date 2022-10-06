package JavaQuestions;

public class countdigitsininteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234; // total digits =7
		int count =0;
		while(num !=0)
		{
			num = num/10;
			++count;
		}
		System.out.println(count);
		
		//fibonacci series
		int num1=10;
		int t1=0;
		int t2=1;
		for(int k=1;k<= num1;k++)
		{
			System.out.println(t1);
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}
	
	}
}
