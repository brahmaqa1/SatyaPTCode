package FilesHanldingBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadNotepadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f =  new File("C:\\brahma\\Practise\\TestFile.txt");

		FileReader fr = new FileReader(f);

		BufferedReader  br  = new BufferedReader(fr);

		//		String line= br.readLine();
		//		System.out.println("line=" + line);
		//
		//		line= br.readLine();
		//		System.out.println("line=" + line);
		//		
		//		line= br.readLine();
		//		System.out.println("line=" + line);
		//		
		//		
		//		line= br.readLine();
		//		System.out.println("line=" + line);
		//		
		//		line= br.readLine();
		//		System.out.println("line=" + line);//null  if there is no line to read, readline() return null

		//*************************

		//		while(  br.readLine() != null)
		//		{
		//			System.out.println("lines=" + br.readLine());
		//		}

		String x,y="";
		while(( x=  br.readLine()) != null)
		{
			System.out.println("lines --->" +x+  "le="+x.length());
			y= y+x;
		}
		System.out.println(y+ ",le="+y.length());
		
//		System.out.println("lines --->" +br.read());
		
		

	}

}
