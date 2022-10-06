package JavaQuestions;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 333; // 654321
		int rev_num = 0;
		
		while(num != 0)
		{
			int n = num%10;
			rev_num=rev_num*10+n;
			num=num/10;
		}
		System.out.println(rev_num);
		

	}

}
