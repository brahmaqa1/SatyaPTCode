package FilesHanldingBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2ForChait {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//   hanlde folder and files -- we have some class

		//		File f = new File("C:\\brahma\\Practise\\Testfile.txt");
		//		//		File f = new File("C:\\brahma\\Practise\\Testfile2.txt");// error
		//		// java.io.FileNotFoundException: C:\brahma\Practise\Testfile2.txt (The system cannot find the file specified)
		//
		//		FileReader fr = new FileReader(f);// throws FileNotFoundException
		//		BufferedReader  br = new BufferedReader(fr);
		//
		//		String line1=	br.readLine();// throws IOException
		//		System.out.println("line1="+ line1);
		//
		//		// read 2nd line
		//		String line2= br.readLine();
		//		System.out.println("line 2 ="+ line2);
		//
		//		// read 3rd line
		//		String line3= br.readLine();
		//		System.out.println("line 3="+ line3);
		//
		//
		//		// read 4th line
		//		String line4= br.readLine();
		//		System.out.println("line 3="+ line4);// null

		//*****************************
		// suupose if we have 100 lines 

		File f = new File("C:\\brahma\\Practise\\Testfile.txt");
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);

		// read lines

		//		  while(br.readLine() !=null)// line1 != null
		String x="";
		while((x=br.readLine()) !=null)// line1 != null
		{
//			System.out.println("lines="+ br.readLine());
			System.out.println("lines=" + x);
		}

			

	}

}
