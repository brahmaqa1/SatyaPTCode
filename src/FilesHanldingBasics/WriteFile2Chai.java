package FilesHanldingBasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2Chai {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File     
//		FR         - FW
		//BR       -BW
//		
//		File f = new File("C:\\brahma\\Practise\\Testfile.txt");
//		FileWriter  fw = new FileWriter(f);// throws IOException 
//		BufferedWriter bw = new BufferedWriter(fw);
//		
//		bw.write("add Line -1");
//		bw.write("add Line -2");
//		
//		bw.write("Line-3");
//		bw.newLine();
//		
//		bw.write("Line-4");
//		bw.newLine();
//		bw.write("Line-5");
//		
//		bw.flush();// if we dotnt use flush()- it does not write text to file..
		System.out.println("ends");
		//********************
		
		File f = new File("C:\\brahma\\Practise\\Testfile.txt");
		FileWriter  fw = new FileWriter(f);// throws IOException 
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("New Line-1\n");
		bw.write("New Line-2\n");
		bw.write("New Line-3\n");
		
		bw.flush();
		
		System.out.println("ends");
	}

}
