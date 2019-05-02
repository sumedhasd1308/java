package Java_coding_Assignment;

import java.io.File;

public class DirAllFileCounter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirAllFileCounter d=new DirAllFileCounter();
	int c=	d.getFile("C:\\Temp");
	System.out.println(c);

	}
	
	public  int getFile(String dirPath)
	{
		int count = 0;
	    File f = new File(dirPath);
	    File[] files = f.listFiles();

	    if (files != null)
	    for (int i = 0; i < files.length; i++)
	    {
	        count++;
	        File file = files[i];

	        if (file.isDirectory())
	        {   
	             getFile(file.getAbsolutePath()); 
	        }
	    }
	    return count;
	}

}
