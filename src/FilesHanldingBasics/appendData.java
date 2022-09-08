package FilesHanldingBasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class appendData {

	public static void main(String[] args) throws IOException {
		File f =  new File("C:\\brahma\\Practise\\TestFile.txt");

		FileWriter fw = new FileWriter(f,true);//Care : 
		BufferedWriter   bw  = new BufferedWriter(fw);
		
		bw.write("append -1");	
		bw.write("append -2");
		bw.newLine();
		
		bw.write("append -3");		
		bw.newLine();
		bw.write("append -4");
		
		bw.flush();
//		bw.close();

	}

}
