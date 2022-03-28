package for_stringpractice_02032022;

import java.util.Arrays;

public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "automation testing";
		int count=0;
		findNoChar("automation testing");
		findPunctuations("some people, don't put a full stop (period)!?");
		findVowelCons("Computer science");
		findAnagram();
	}
	public static String findNoChar(String str1)
	{
		int count=0;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Given string is = "+str1);
		System.out.println("Total number of character in string are = "+ count);
	
		return str1;
		
	}
	public static String findPunctuations(String str1)
	{
		int count=0;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='!' || str1.charAt(i)=='.' || str1.charAt(i)==';' || str1.charAt(i)==':' || str1.charAt(i)==',' || str1.charAt(i)=='(' || str1.charAt(i)==')' || str1.charAt(i)=='\"' || str1.charAt(i)=='?')
			{
				count++;
			}
		}
		System.out.println("Given string is = "+str1);
		System.out.println("Total number of punctuations are = "+count);
		return str1;		
	}
	public static String findVowelCons(String str1)
	{
		int vCounter=0, cCounter=0;
		str1=str1.toLowerCase();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u')
			{
				vCounter++;
			}
			else if(str1.charAt(i)>='a' && str1.charAt(i)<='z')	
			{
				cCounter++;
			}
		}
		System.out.println("Given string is = "+str1);
		System.out.println("Vowels are = "+vCounter + "\t"+ "Consonant are = "+cCounter);
		return str1;
	}
	public static String checkAnagram(boolean check)
	{
		String str1 = "grab";
		String str2 = "brag";
		
		if(str1.length()!=str2.length())
		{
			
		}
		return null;
	}
	public static void findAnagram() {

		String str1 = "Grab";
		String str2 = "Brag";

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		if(str1.length()!=str2.length())
		{
		System.out.println("Both are not Anagram");
		}
		else {
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		if(Arrays.equals(char1, char2)==true)
		{
		System.out.println("Both are Anagram");
		}
		else
		{
		System.out.println("Both are not Anagram");
		}
		}
		}
		
}
