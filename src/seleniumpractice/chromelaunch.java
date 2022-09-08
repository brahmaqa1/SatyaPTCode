package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chromelaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.lang.IllegalStateException: The path to the driver executable The path to the driver executable must be set by the webdriver.chrome.driver system property
		//  if we dont set property - for chromerdirver.exe file path 


		// FAQ :  Write a program to open Chrome browser?
		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver", "C:\\brahma\\seleniumSoftwares\\Alldrivers\\chromedriver_win32V103\\chromedriver3242.exe");
		//		java.lang.IllegalStateException: The driver executable must exist: C:\brahma\seleniumSoftwares\Alldrivers\chromedriver_win32V103\chromedriver3242.exe
		// if we pass in vlaid chromedriver.exe file or path - 


		//		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftwares\\All Selenium Jar Files\\chromedriver_win32V96\\chromedriver.exe");

		// create obj for chromedriver   -   opens chrome browser
		ChromeDriver chromebrowser = new ChromeDriver();


		// open URl in browser
		chromebrowser.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");

		// get title of browser and display it
		String title = chromebrowser.getTitle();
		System.out.println("title="+title);// title=All webobjects MyTitle Sumanth



		//HW  get url of browser 
		String currenturl = chromebrowser.getCurrentUrl();
		System.out.println("currenturl= "+currenturl);

		// HW get page source code 
		String pagesource = chromebrowser.getPageSource();
		System.out.println("pagesource = "+pagesource);

		//		output=pagesource = <html><head><title> All webobjects MyTitle Sumanth</title>
		//
		//<script type="text/javascript">
		//	function timeMsg()
		//	{
		//	 var t=setTimeout("alertMsg()",4000);
		//	}
		//	function alertMsg()
		//	{
		//	 var name=prompt("Please enter Employee name","Harry Potter default val");
		//	}
		//	function multipleAlertsMsg()
		//	{
		//	var name=prompt("Please enter Employee name","Harry Potter default val");
		//	alert("Order No : 101 created successfully");	
		//	}
		//</script>
		//</head>
		//
		//<body><form>
		//
		//<h1 align="center">  My Web Page  </h1>
		//First name: <input type="text" value="default value Ram " name="firstname" id="idfirst" class="firstclass" width="55">
		//Last name: <input id="idfirst" type="text" name="lastname" class="firstclass">
		//<br>
		//Test field: <input id="testid201" type="text" name="HUL-testname-101" class="firstclass">
		//
		//Password: <input id="idpwd" type="password" name="pwd"> <br>
		//
		//<input id="maleid" type="radio" name="sex" value="male"> Male
		//<input id="femaleid" type="radio" name="sex" value="female"> Female  <br>
		//
		//<input id="bikeid" type="checkbox" name="bike" value="Bike" class="Vehicle">I have a bike
		//<input type="checkbox" id="carid" name="bike" value="Car">I have a car <br>
		//<input type="checkbox" id="bikeid" name="bike" value="Car" disabled="">I have an aeroplane <br>
		//
		//Ename :<input type="text" id="bikeid" name="myname" disabled="">Testbox is disabled  <br>
		//
		//<input id="MyButton" type="submit" value="My Submit">
		//<button name="Login"> Login </button>
		//
		//
		//	<select name="cars" id="idfirst">
		//		<option value="maruthival">Maruthi</option>
		//		<option selected="selected" value="Swiftvdival">Swiftvdi</option>
		//		<option value="Mercedesval">Mercedes</option>
		//		<option value="audival">Audi</option>
		//		<option> Kia </option>
		//		<option> BMW </option>
		//	</select>
		//
		//	<select name="bikes" id="bikesid">
		//		<option value="Hondaval">Honda</option>
		//		<option selected="" value="suzukival">  suzuki	</option>
		//		<option selected="" value="yamahaval"> yamaha	</option>
		//		<option selected="" value="Heroval">    Hero  	</option>
		//		
		//	</select>
		//
		//
		//
		//Multi select::
		//<select name="MultiCars" multiple="" width="1050" height="800">
		//  <option value="Maruthival">Maruthi</option>
		//  <option value="Swiftvdival">Swiftvdi</option>
		//  <option value="Benzval" selected="">Benz</option>
		//  <option value="audival">Audi</option>
		//  <option value="BMWval">BMW</option>
		//</select>
		//<textarea rows="3" cols="20">The cat was playing in the garden.
		//</textarea>
		//
		//</form>
		//
		//<a href="D:\Practise\qtp practise\web apps\WebTableAll.html">  ToolTip Sumanth </a> <br>
		//<a href="D:Practise\qtp practise\web apps\tooltip.html">  ToolTip Link  </a>  <br>
		//<a href="D:\Practise\qtp practise\web appsweb apps\WebTableAll.html"> WebTableAll Link </a> <br>
		//<a href="D:\Practise\qtp practise\web apps\Login Form.html" target="_blank"> Login Form Link</a>
		//
		//<a href="https://www.google.com/">  Click My Google </a>
		//
		//<input type="button" id="alertid1" value="Display alert box in 3 seconds" onclick="timeMsg()">
		//<input type="button" id="alertid2" value="Display multipleAlertsMsg" onclick="multipleAlertsMsg()">
		//<br>
		//
		//
		//
		//<p>Image-link: Still a link, but with no boders:
		//<a href="default.asp"> <img style="border:0;" src="D:\Practise\qtp practise\web appsweb apps\Images\Penguins.jpg" alt="HTML tutorial" width="40" height="70"></a></p>
		//
		//<button id="loginid" onclick="window.open(&quot;Login Form.html&quot;,&quot;loginformwindowname&quot;,
		//&quot;width=500,height=500&quot;);"> open loginform </button>
		//
		//
		//<button id="allid" onclick="window.open(&quot;WebTableAll.html&quot;,&quot;allobjectswindowname&quot;,
		//&quot;width=500,height=500&quot;);">WebTableAll </button> 
		//
		//<button id="simpleid" onclick="window.open(&quot;Simple ALL objects.html&quot;,&quot;HelpWindow&quot;,
		//&quot;width=500,height=500&quot;);">Simple ALL objects</button> <br> <br>
		//
		//Upload Files <input type="text" name="uploadname"> <button> Upload</button>  <br>
		//<input type="file" id="fileid" name="filename"> 
		//
		//Download Files:
		//
		//<a href="Penguins.jpg" download=""> Download link </a>
		//  
		//
		//
		//
		//
		//
		//
		//</body></html>

		//  HW  close 
		//chromebrowser.close();

		// quit	
		chromebrowser.quit();


		// ff -- FirefoxDriver -class
		// IE -InternetExplorerDriver - class
		// EdgeDriver - cclass
		// HW Repeat the same for and Fireffox(geckodriver.exe ) browser and Edge browser,?

		By.xpath("");
		By.cssSelector("");
		
		By.linkText("visible link text from page");
		By.partialLinkText(" partial link text");
		
		By.tagName("tag anme ");
		



	}


}
