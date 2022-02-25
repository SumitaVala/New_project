package practice_stringProgrtam;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s11 = new Student(111, "Riya", "Maths", 98);
		Student s12 = new Student(222, "Riya1", "Maths1", 95);
		Student s13 = new Student(333, "Riya2", "Maths2", 69);
		Student s14 = new Student(444, "Riya3", "Maths3", 87);
		Student s15 = new Student(555, "Riya4", "Maths4", 52);
		
		Map map1 = new HashMap();
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		
		map1.put(11, "sumita");
		map1.put(22, "sumita1");
		map1.put(13, "sumita2");
		map1.put(33, "sumita3");
		
		map2.put(1, "sumita");
		map2.put(2, "sumita1");
		map2.put(1, "sumita2");
		map2.put(3, "sumita3");
		map2.put(null, "sumita");
		//map2.put(null, "sumita1");

		//Old style to travel map
		/*Set set = map1.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println("Keys = "+entry.getKey() + "  Value = "+entry.getValue());
		}*/
		
		map2.replace(2, "Aarvi");
		map2.putAll(map1);
		for(Map.Entry entry: map2.entrySet())
		{
			System.out.println(entry.getKey() +"  "+ entry.getValue());
		}
		HashMap<Integer,Student> map3 = new HashMap<Integer,Student>(); 
		map3.put(1, s11);
		map3.put(2, s12);
		map3.put(3, s13);
		map3.put(4, s14);
		map3.put(5, s15);
		
		for(Map.Entry<Integer, Student> entry:map3.entrySet())
		{
			int key = entry.getKey();
			Student s = entry.getValue();
			System.out.print("Student Key = "+key);

			System.out.print(" ------>   "+s.st_No+" "+s.st_Name+" "+s.st_Sub+" "+s.st_Mark);
			System.out.println();
		}
		
		TreeMap <Integer,Integer> tree =new TreeMap<>();
		
		tree.put(1,1);
		tree.put(21, 65);
		tree.put(22, 65);
		tree.put(5, null);
		
		for(Map.Entry<Integer, Integer> treeentry:tree.entrySet())
		{
			System.out.println(treeentry.getKey() +"  "+ treeentry.getValue());
		}
	}

}
