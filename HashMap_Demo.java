package Java_coding_Assignment;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		print(map);
		map.put("Vishal", 10);
		map.put("sachin", 20);
		map.put("Vaibhav", 30);
		
		System.out.println("Size of map is:-"+map.size());
		print(map);
		if(map.containsKey("vishal"))
		{
			Integer a= map.get("vishal");
			System.out.println("value of key vishal is:"+a);
			
		}
		
		map.clear();
		
		print(map);
	}
	 public static void print(Map <String, Integer> map)
     {
     	if(map.isEmpty())
     	{
     		System.out.println("map is empty");
     	}
     	else
     	{
     		System.out.println(map);
     	}
     }

}