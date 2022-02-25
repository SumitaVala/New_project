package sumita_practice;

import java.io.File;

import org.junit.Test;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printfilelist("C:\\Users\\LENOVO\\eclipse-workspace\\sumita_practice\\target");
		
		String s1 = new String ("Alpesh");
		String s2 = new String ("Alpesh");
		String s3 = s1;

		if (s1.equals(s2))
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		if (s1==s2)
			System.out.println("equal 1");
		else
			System.out.println("not equal 1");
		
		if (s1==s3)
			System.out.println("equal 2");
		else
			System.out.println("not equal 2");
	}
	

public static void printfilelist(String location) {
	File[] files = new File(location).listFiles();
	
	for (File file : files) {
	    if (file.isFile()) {
	        System.out.println(file.getName());
	    }else {
	    	String newlocation=location +"/"+file;
	    	
	    	printfilelist(file.toString()); 
	    }
	}
}
	
	@Test
	public void test1() {
		System.out.println("my first test");
	}
	
	@Test
	public void test2() {
		System.out.println("my second test");
	}
}
