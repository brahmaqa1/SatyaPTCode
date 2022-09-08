package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgelaunching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\brahma\\seleniumSoftwares\\Alldrivers\\edgedriver_win64\\msedgedriver.exe");
		// webdriver.edge.driver-->key for edge driver

		//HW //ChromeDriver edge = new EdgeDriver(); 
		//Error:  Exception in thread "main" java.lang.Error: 
		//Unresolved compilation problem: ChromeDriver cannot be resolved to a type
		// write a program to open a browser?
		WebDriver edge = new EdgeDriver();

		//Q. command to open a Url in browser?
		edge.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		String currurl =	edge.getCurrentUrl();
		System.out.println("currurl = "+currurl);

		//Q. command to get title of the current page?
		String title=	edge.getTitle();
		System.out.println("title ="+title);

		//Q. command to get HTML code of the page?
		String pagesource = edge.getPageSource();
		System.out.println("pagesource ="+pagesource);

		//Q. command to close all browser tabs which are opened by selenium?
		//edge.quit();
		edge.findElement(By.id("idfirst")).clear();
		edge.findElement(By.id("idfirst")).sendKeys("Rama");
		
		edge.findElement(By.className("Vehicle")).click();
		
		edge.findElement(By.name("pwd")).clear();
		edge.findElement(By.name("pwd")).sendKeys("password");
		
		edge.findElement(By.id("testid3456")).clear();
		edge.findElement(By.id("testid3456")).sendKeys("loadtest");
		
		
		edge.findElement(By.xpath("//input[@id='idfirst'] [@name='lastname']")).sendKeys("krishna");
		
		edge.findElement(By.id("maleid")).click();
		
		
		
		



		// Q.command to edge browser?
		//edge.close();
	}

}
