package data;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("C:\\Testing\\prop.properties");
		Properties prop = new Properties();
		
		prop.load(f);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String email = prop.getProperty("correctEmail");
		System.out.println(email);
		
		System.out.println(prop.getProperty("tool"));
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("Defect", "Jira");
		System.out.println(prop.getProperty("Defect"));
		
		prop.setProperty("language", "Java");
		System.out.println(prop.getProperty("language"));
		
		FileOutputStream fo = new FileOutputStream("C:\\\\Testing\\\\prop.properties");
		prop.store(fo, "Adding to the properties file");
	}

}
