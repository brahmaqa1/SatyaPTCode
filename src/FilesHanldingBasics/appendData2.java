package FilesHanldingBasics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class appendData2 {

	public static void main(String[] args) throws IOException {
		File f =  new File("C:\\brahma\\Practise\\TestFile.txt");

		FileWriter fw = new FileWriter(f,true);// appending 
		BufferedWriter bw=  new BufferedWriter(fw);
		
		bw.write("1.adding data to existing file\n");
		bw.write("2. adding data to existing file\n");
		
		bw.flush();
		
		System.out.println("ends");
		
//		HW..how to get words count from notepad file?
//
//				HW. how to get charctrs count from notepad file?
//				HW how to get digits count from notepad file?
//
//				HW Lines count from note pad file ?
	}

}
