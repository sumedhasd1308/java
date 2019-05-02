package Java_coding_Assignment;


import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirFileCountWithPath {

	public static void main(String[] args) {
		 List<String> fileNames = new ArrayList<>();
		// TODO Auto-generated method stub
		// List<String> fileNames = new ArrayList<>();
		 try {
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\Temp"));
			for (Path path : directoryStream) {
		        fileNames.add(path.toString());
		      }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		 System.out.println("File Count:"+fileNames.size());
		 

	}

}
