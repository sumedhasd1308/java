package JavaStudy;

public class StringDemo {
	public static void main(String[] args) {
		
	
	StringBuilder s1 = new StringBuilder("Java");
	String s2 = "Love";
	s1.append(s2);
	System.out.println(s1);
	System.out.println(s2);
	s1.substring(4);
	System.out.println(s1);
	System.out.println(s2);
	int foundAt = s1.indexOf(s2);
	System.out.println(foundAt);
	StringBuilder s3 = new StringBuilder("Sumedha");
	StringBuilder s4 = new StringBuilder(" ");
	s3.append(s2);
	System.out.println(s3);
	System.out.println(s2);
	 s3.substring(4);
	System.out.println(s3);
	

	}

}
