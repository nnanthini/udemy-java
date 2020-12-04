package ReadingWritingFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream f = new FileInputStream(System.getProperty("user.dir")+"\\src\\ReadingWritingFiles\\object.properties");
		prop.load(f);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
	
	}

}
