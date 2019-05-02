package Java_coding_Assignment;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Dictionary<Integer, String> d=new Hashtable<Integer,String>();
		d.put(1, "Passion");
		d.put(2, "Motion");
		d.put(3, "Caution");
		System.out.println("Dictionary elements are->>"+d);
		Enumeration<Integer> key=d.keys();//Enumeration useful for only legacy 
		//classes as vector and also not useful for modification like iterator
		while(key.hasMoreElements())
		{
			System.out.println(key.nextElement());
		}
		
		Enumeration<String> element=d.elements();
		while(element.hasMoreElements())
		{
			System.out.println(element.nextElement());
		}

	}

}
