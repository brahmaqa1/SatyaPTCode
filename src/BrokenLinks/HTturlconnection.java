package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTturlconnection {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		String url= "https://www.guru99.com/find-broken-links-selenium-webdriver.html";
		
//		String url= "https://www.guru99.com/find-broken-links-selenium-webdriver1234.html";
		HttpURLConnection  httpUrlcon = (HttpURLConnection)   (new URL(url).openConnection());
		
		httpUrlcon.setRequestMethod("HEAD");
		httpUrlcon.connect();
		
		int statuscode= httpUrlcon.getResponseCode();
		
		System.out.println("status code="+ statuscode);//200  or  404
		if(statuscode >=400)
		{
			System.out.println("broken link");
		}
		else
		{
			System.out.println("not broken link");
		}
		

	}

}
