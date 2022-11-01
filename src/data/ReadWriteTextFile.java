package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create new text file
		File f = new File("C:\\Testing\\temp.txt");
		f.createNewFile();
		
		//Write into text file
		FileWriter w = new FileWriter(f);
		BufferedWriter our = new BufferedWriter(w);
		
		our.write("This is first line");
		our.newLine();
		our.write("This is 2nd line");
		our.newLine();
		our.write("This is 3rd line");
		our.newLine();
		our.write("This is 4th line");
		
		our.flush();
		
		//Read text file
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/

		String line;
		int i = 0;
		while((line = rd.readLine())!=null) {
			
			System.out.println(line);
			i++;
		}
		
		System.out.println("Number of lines: "+i);

	}

}
