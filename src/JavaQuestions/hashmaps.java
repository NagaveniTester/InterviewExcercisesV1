package JavaQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmaps {
	public static void main(String[] args) {
		
		Map<String,Integer> marks = new HashMap<String,Integer>();
		marks.put("Ram",100);
		marks.put("Tom", 67);
		marks.put("Subbu",120);
		
		for(Entry m:marks.entrySet())
			System.out.println(m);
		
		//System.out.println(marks.get("Ram"));
		//System.out.println(marks.get("Tom"));
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Tom");
		al.add("Nav");
		al.add("Prem");
		al.add("Syraj");
		System.out.println(al.size());
		for(String s: al)
			System.out.println(s);
		al.add(2,"zero");
		for(String s1: al)
			System.out.println(s1);
		al.remove(2);
		for(String s2: al)
			System.out.println(s2);
		
		
		
		
	}
}
