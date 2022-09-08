package Arraysbasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwodimensionalArraysbasics {

	public static void main(String[] args) {
		
		//Declaration – Syntax:
//data_type[][] array_name = new data_type[x][y];
//        For example: int[][] arr = new int[10][20];
		
		//Initialization – Syntax:
		//array_name[row_index][column_index] = value;
//        For example: arr[0][0] = 1;
			
		int i,j;
		int arr [] []  = new int [2][3];
		// 2-  rows  --  0 - 1
		//3-  cols-  0,1,2; 
		arr[0][0]= 20;
		arr[0][1]=30;
		arr[0][2]=40;
		
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		
		System.out.println("arr lneg=" +  arr.length);//2   rows 
		System.out.println("cols cnt= " + arr[0].length);//  col cnt= 3
		
		System.out.println("val=" +  arr[1] [0]);
		
		for(i=0;i<=1;i++)
		{
			for( j=0;j<=2;j++)
			{
				System.out.println("val="+ arr [i] [j] );
			}
		}
		
		//
		System.out.println("*********************");
		for(i=0;i<=arr.length-1;i++)
		{
			for( j=0;j<=arr[0].length-1;j++)
			{
				System.out.println("val="+ arr [i] [j] );
			}
		}
		
	}

}
