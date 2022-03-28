package for_stringpractice_02032022;

public class str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	divideString();
		System.out.println();
		removeSpace();
		System.out.println();
		stringLowertoUpper();
		System.out.println();
		replaceWhitespace();
		System.out.println();
		palindromeString();
		System.out.println();
		stringRotation();
		System.out.println();
		minmaxChar();
		System.out.println();
		stringReverse();
		System.out.println();
		stringDuplicatechar();
		System.out.println();
		stringDuplicateword();*/
		stringcovertuppertolower();
		
	}
	public static void divideString() {
		String str1 = "automationtesting";

		int len = str1.length();
		int n;
	}
	public static void removeSpace() {
		String str1 = "my name is sumita";

		str1 = str1.replaceAll("\\s+","");
		System.out.println(str1);
	}
	public static void stringLowertoUpper() {
		String str1= "AutoMaTIOn testing";
		StringBuffer str2 = new StringBuffer(str1);

		for(int i=0;i<str1.length();i++)
		{
		if(Character.isUpperCase(str1.charAt(i)))
		{
		str2.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
		}
		else if(Character.isLowerCase(str1.charAt(i)))
		{
		str2.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
		}
		}
		System.out.println("After convert string  = "+str2);
	}
	public static void replaceWhitespace() {
		String str1 = "automation testing";
		char ch = '-';

		str1 = str1.replace(' ', ch);
		System.out.println(str1);
	}
	public static void palindromeString() {
		String str1 = "askanaksa";
		boolean flag = true;

		for(int i=0;i<str1.length()/2;i++)
		{
		if(str1.charAt(i)!=str1.charAt(str1.length()-i-1))
		{
		flag=false;
		break;
		}
		}
		if(flag==true)
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("Not palindrome");
		}
	}
	public static void stringRotation() {
		String str1 = "abcde", str2="gacbe";

		if(str1.length()!=str2.length())
		{
		System.out.println("Second string is not a rotation of first string");
		}

		else
		{
		str1 = str1.concat(str1);
		if(str1.indexOf(str2)!=-1)
		{
		System.out.println("Second string is a rotation of first string");
		}
		else
		{
		System.out.println("Second string is not a rotation of first string");
		}
		}
	}
	public static void minmaxChar() { 
		
		String str = "Automation Testing using Selenium and Java";
		str=str.toLowerCase();
		//String str = "grass is greener on the other side"; 
		char[] string = str.toCharArray();
		int[] freq = new int [str.length()];
		int i,j,min, max;
		char maxChar=str.charAt(0) ,minChar=str.charAt(0);
		
		for(i=0;i<string.length;i++)
		{
			freq[i]++;
			for(j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0')
				{
					freq[i]++;
					string[j]='0';
				}
			}
		}
		min=max=freq[0];
		for(i=0;i<freq.length;i++)
		{
			if(min>freq[i] && freq[i]!='0')
			{
				min=freq[i];
				minChar=string[i];
			}
			if(max<freq[i])
			{
				max=freq[i];
				maxChar=string[i];
			}
			
		}
		System.out.println("Minium character = "+minChar);
		System.out.println("Maximum character = "+maxChar);
	}
	public static void stringReverse() {
		
		String str= "Automation";
		String strrev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev = strrev+str.charAt(i);
		}
		System.out.println("Reverse string = "+strrev);
	}
	public static void stringDuplicatechar() {
		String str = "automation testing";
		char[] ch = str.toCharArray();
		
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.println("Character = "+ch[i]+" & No. of count = "+count);
			}
		}			
	}
	public static void stringDuplicateword() {
		String str = "autimation testing and manual testing";
		String word[] = str.split(" ");
		int count;
		
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="0";
				}
			}
			if(count>1 && word[i]!="0")
			{
				System.out.println("Duplicate words in string = "+word[i]);
			}
		}	
	}
	public static void stringcovertuppertolower() {
		
		String str = "AUTomatiOn TesTiNg";
		int count;
		str=str.toLowerCase();
		char chr[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(chr[i]==chr[j] && chr[i]!=' ')
				{
					count++;
					chr[j]='0';
				}
			}
			if(count>1 && chr[i]!='0')
			{
				System.out.println(count+" and "+chr[i]);
			}
		}
		
	}
	
}
