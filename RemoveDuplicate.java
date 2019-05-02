package JavaStudy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		System.out.println("Enter string to remove duplicates");
		Scanner sc= new Scanner(System.in);
		str=sc.next();
		char arr[]=str.toCharArray();
		String targetStr = "";
        for (char value : arr) {
           
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; 
            }
        }
      System.out.println(targetStr); 
		
	}

}
