package practice_stringProgrtam;

public class stringopration {
	
	String strnew = "kanak";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringopration obj = new stringopration();
		
		removespace();
		conuptolow("sumita Mitansh");
		replacechar("sumita  mitansh aarvi", '-');
		obj.strPalindrome();
		strDuplicate("one two three one one two");
		strswap("sumita", "vala");
		strReverse("sumita");
			
	}
	
	public static void removespace() {
		String str = "sumita aarvi   mitansh";
		str=str.replaceAll("\\s+", "");
		System.out.println(str);

	}
	public static void conuptolow(String str) {
		
		str=str.toUpperCase();
		System.out.println(str);
		str=str.toLowerCase();
		System.out.println(str);
	}	
	public static void replacechar(String str, char ch) {
		
		str = str.replace(' ', ch);
		System.out.println(str);
	}
	public void strPalindrome() {
		
		boolean flag = true;
		for(int i=0;i<this.strnew.length()/2;i++)
		{
			if(strnew.charAt(i)!=strnew.charAt(strnew.length()-i-1))
			{
				flag=false;
				break;
			
			}
			
		}
		if(flag)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
	
	public static void strDuplicate(String str) {
		
		int count ;
		str= str.toLowerCase();
		//String word[] = str.split(" ");
		String words[] = str.split(" ");    
		for(int i=0;i<words.length;i++)
		{
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="O";
				}
			}
			  if(count > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
		}
	
	}
	public static void strswap(String str1, String str2) {
		
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println(str1+"  "+str2);
	}
	public static void strReverse(String str) {
		
		String strrev ="";
		int i,j;
		System.out.println("Before reverse string = "+str);
		for(i=str.length()-1;i>=0;i--)
			
			strrev=strrev+str.charAt(i);
		System.out.println("After reverse string = "+strrev);
		
		for(j=0;j<strrev.length();j++)
		
			System.out.print(strrev.charAt(j)+" & ");


	}
}
