package FilesHanldingBasics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f =  new File("C:\\brahma\\Practise\\TestFile.txt");

		FileWriter fw = new FileWriter(f);

		BufferedWriter   bw  = new BufferedWriter(fw);
		
//		bw.write("Line-1");
//		bw.write("Line-2");
//		bw.write("Line-3");
		
		//***********************
//		bw.write("Line-1\n");
//		bw.write("Line-2\n");
//		bw.write("Line-3\n");
		
		//***********************
		bw.write("Line-1\t");
		bw.write("Line-2\t");
		bw.write("Line-3\t");
		
		//  dont write to file
		bw.flush(); // must be there
		
		System.out.println("ends ");
		

	}

}
