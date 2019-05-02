package Java_coding_Assignment;

import java.io.File;
import java.util.Scanner;

public class DirFileCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter path");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		
		
		
		File directory=new File(str);
	    int fileCount=directory.list().length;
	    System.out.println("File Count:"+fileCount);
	  }

	}


