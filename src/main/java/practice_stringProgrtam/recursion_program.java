package practice_stringProgrtam;

public class recursion_program {

	public static void main(String[] args) {
		
		System.out.println(fact(5));
		
	
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
