package FilesHanldingBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetCountOfWordsFromNotepadFile {

	
	
	public static void main(String[] args) throws IOException {
		
		File f =  new File("C:\\brahma\\Practise\\TestFile.txt");

		FileReader fr = new FileReader(f);
		BufferedReader  br  = new BufferedReader(fr);	

		String x,y="";
		int linesCnt = 0 ;
		int charcnt= 0;
		int wordscnt=0;
		while(( x=  br.readLine()) != null)
		{
			System.out.println("lines --->" +x+  "le="+x.length());
			linesCnt = linesCnt +1; 
			charcnt = charcnt + x.length();// 0 + 10 =10 + 10=20+10=30
			String sarr [] = x.split(" ");
			wordscnt  =wordscnt +sarr.length;
		}
		
		
		System.out.println(" all lines cnt=" + linesCnt);
		System.out.println(" all characters cnt=" + charcnt);
		// words cnt
		System.out.println(" all wordscnt cnt=" + wordscnt);
		
		// vowesl cnt
		
		//consonant cnt 

	}

}
