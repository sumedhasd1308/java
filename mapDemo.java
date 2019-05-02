package JavaStudy;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="cat";
       String b="tacf";
       //Map map=new HashMap();
       Map<Character, Integer> map = new HashMap<>();
       for (int k = 0; k < b.length(); k++){
		     char letter = b.charAt(k);    

		    if( ! map.containsKey(letter)){
		        map.put( letter, 1 );
		    } else {
		        Integer frequency = map.get( letter );
		        System.out.println(frequency);
		        map.put( letter, ++frequency );
		        
		    }
		}
	}

}
