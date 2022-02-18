package practice_stringProgrtam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collection_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Aarvi", "English", 99);
		Student s2 = new Student(102, "Sarvin", "Maths", 90);
		Student s3 = new Student(103, "Mitansh", "Science", 89);
		Student s4 = new Student(104, "Swara", "Hindi", 90);
		
		//ArrayList<Student> list3 = new ArrayList<Student>();
		LinkedList<Student> list3 = new LinkedList<Student>();
		
		list3.add(s1);
		list3.add(s2);
		list3.add(s3);
		list3.add(s4);
		list3.addFirst(s3);
		list3.addLast(s1);

		Iterator<Student> itr1 = list3.iterator();
		while(itr1.hasNext())
		{
			Student std = (Student)itr1.next();
			System.out.println(std.st_No+" "+std.st_Name+" "+std.st_Sub+" "+std.st_Mark);
	
		}
		list3.contains(s1);
		System.out.println();
				
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Sumita");
		list1.add("Alpesh");
		list1.add("AArvi");
		list1.add("Mitansh");
		list1.add("Sumita");
		list1.add("Sarvin");
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("Sumita");
		list2.add("Alpesh");
		
		list1.addAll(list2);
		Collections.sort(list1);
		Collections.reverse(list1);
		Iterator<String> itr = list1.iterator();
		
		
		// Iterate Arraylist using Iterator and for loop
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		/*for(String record:list1)
		{
			System.out.println(record);
		}*/
		System.out.println("");
		System.out.println(list1.get(3));
		
		
	}

	private static Student Student(Student next) {
		// TODO Auto-generated method stub
		return null;
	}


}
