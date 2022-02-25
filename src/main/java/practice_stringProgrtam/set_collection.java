package practice_stringProgrtam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> set1 = new HashSet <String> ();
		
		set1.add("abc");
		set1.add("def");
		set1.add("ghi");
		set1.add("abc");
		set1.add("abc");
		set1.add(null);
	
		Iterator <String> itr = set1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		//set1.remove(set1.contains("abc"));
		set1.contains(set1.add("abe"));
		set1.contains(set1.remove("abc"));
		System.out.println(set1);
		System.out.println();
		//setclass();
		seettree();
	}
	public static void setclass() {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(null);
		
		//HashSet <Integer> set2 =new HashSet(array);
		HashSet set2 =new HashSet(array);
		
		System.out.println(set2);
		System.out.println();
		LinkedHashSet<String> set3 = new LinkedHashSet<String>();
		set3.add("hjd");
		set3.add("fgfdg");
		set3.add("hhjh");
		set3.add("dbgghjd");
		set3.add("fdfdds");
		set3.add("dbgghjd");
		set3.add(null);
		set3.add(null);
		
		System.out.println(set3.size());
		System.out.println();
		System.out.println(set3);
		set3.contains(set3.add("lokl"));
		
		System.out.println();
		for(String f1 : set3)
		{
			System.out.println("Using for to iterat  "+f1);
		}
	}
	public static void seettree() {
		
		TreeSet <Integer> tree1 = new TreeSet <Integer>();
		tree1.add(12);
		tree1.add(65);
		tree1.add(99);
		tree1.add(2);
		tree1.add(12);
	//	tree1.add(null);
	 	System.out.println(tree1); 
	 	System.out.println();
		TreeSet <String> tree2 = new TreeSet <String>();
		tree2.add("NX");
		tree2.add("PAjss");
		tree2.add("dhjfjsd");
		tree2.add("hAhh");
		tree2.add("AAhh");
		System.out.println(tree2.descendingSet());
		System.out.println();
		System.out.println(tree2.pollFirst());
		System.out.println(tree2.pollLast());
		System.out.println();
		Iterator itr1 =tree2.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
