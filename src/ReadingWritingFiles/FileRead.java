package ReadingWritingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\ezhil\\Desktop\\FrontEndNanodegree\\Udemy - Selenium\\FileOperations\\writeFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		String line = null;
		while((line=b.readLine())!=null) { //readLine() reads one line every time
			System.out.println(line);
		}
		b.close();
		
		
	}

}
