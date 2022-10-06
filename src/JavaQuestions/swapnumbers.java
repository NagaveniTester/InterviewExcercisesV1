package JavaQuestions;

public class swapnumbers {

	public static void main(String[] args) {

		int a =40;
		int b = 60;
		int temp;
		System.out.println("Before Swapping: " +a+ "," +b);
		//temp=a;
		//a=b;
		//b=temp;
		//System.out.println("After Swapping: " +a+ "," +b);
		
		//without temp
		
		a=a-b; // -20
		b=a+b; // 40
		a=b-a; // 60
		
		System.out.println("After Swapping: " +a+ "," +b);
	}

}
