package for_stringpractice_02032022;

public class str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyChar();
		seperatechar();
		System.out.println();
		swapString();
	}
	public static void frequencyChar() {
	
		String str= "sumita valals";
		
		int[] freq = new int[str.length()];
		int i,j;
		char[] ch = str.toCharArray();
		
		for(i=0;i<ch.length;i++)
		{
			freq[i]=1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ')
				{
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		for(i=0;i<freq.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='0')
			{
				System.out.println(freq[i]);
			}
		}
	}
	public static void seperatechar() {
		String str ="sumita";
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
	public static void swapString() {
		String str1 ="sumita";
		String str2 = "vala";
		
		str1=str1+str2;
		str2=str1.substring(0, (str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println(str1+ " " +str2);
		
	}
}







