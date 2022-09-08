package FilesHanldingBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class NotePadeCharactersCount {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		File f=new File("C:\\brahma\\Practise\\TestFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line = br.readLine();
		line = br.readLine();
		line = br.readLine();
		line = br.readLine();
		System.out.println("Line="+line);//output:Line=New Line-1
//		System.out.println("line ends");
//		String y;
//		while((y=br.readLine())!=null) {
//			System.out.println(y);
//			
//		}
		
		int len = line.length();
		System.out.println("len ="+len);
	    
		char t= line.charAt(0);
		System.out.println(t);
//		char ch =y.charAt(0);
//		System.out.println("ch  ="+ch);
//		Stream<String>  strString = br.lines();
//		System.out.println("strString  ="+strString);
		for(int i=0;i<=len-1;i++) {
			System.out.println("Character="+line.charAt(i));
		}
		

	}

}
