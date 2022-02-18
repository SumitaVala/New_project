package practice_stringProgrtam;

public class recursion_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,number = 5;
		int factorial;
		
		factorial=fact(number);
		System.out.println(factorial);
	}
	static int fact(int no) {
		
		if(no==0)
		{
			return 1;
		}
		else
		{
			return(no*(fact(no-1)));
		}
	
	}
}
