package CookiesHanlding;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TableBasics.allcellstext;

public class CookiesHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		// Creation driver object from chrome browser
		WebDriver driver = new ChromeDriver();
		//open url in browser
		
		driver.get("https://www.udemy.com/");  
		
		
		Set<Cookie> allCookies= driver.manage().getCookies();
		// get cookies cnt
		System.out.println("count=" +  allCookies.size());// 25
		
		// read 
		Iterator<Cookie> it=	allCookies.iterator();
		
		while(it.hasNext())
		{
			System.out.println("***********************");
			Cookie ck= it.next();
			
			System.out.println("cookie name="+ ck.getName());
			System.out.println("cookie value="+ ck.getValue());
			System.out.println("cookie domain-"+ck.getDomain());
			System.out.println("cookie Expiry-"+ck.getExpiry());
			
			
			System.out.println("cookie isSecure-"+ck.isSecure());
			System.out.println("cookie isHttpOnly-"+ck.isHttpOnly());
			System.out.println("***********************");
		}
		
		// HW   use for each loop
		
		
		// delete specific cookie 
		driver.manage().deleteCookieNamed("ud_cache_logged_in");
		
		
		allCookies= driver.manage().getCookies();
		// get cookies cnt
		System.out.println("after deleting count=" +  allCookies.size());
		
		
		// add my own cookie
		Cookie  ck = new Cookie("MyCookie", "Brahma");
//		Cookie ck2 = new Cookie(null, null, null, null, null);// can add these also
		
		driver.manage().addCookie(ck);
		allCookies= driver.manage().getCookies();
		// get cookies cnt
		System.out.println("after adding count=" +  allCookies.size());
		
		
		// delete cookies
//		driver.manage().deleteAllCookies();
		
		allCookies= driver.manage().getCookies();
		// get cookies cnt
		System.out.println("count=" +  allCookies.size());
		
		
		
		
	}

}


//cookie name=ud_cache_price_country
//cookie value=IN
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false

//cookie name=eventing_session_id
//cookie value=phLIMnNlTheAZdZRwbgCcA-1659593351962
//cookie domain-.udemy.com
//cookie Expiry-Thu Aug 04 11:39:11 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false

//cookie name=ud_firstvisit
//cookie value=2022-08-04T05:39:09.804285+00:00:1oJTZe:8T9ZidkOiZ8lDJ3qmdSCO2Wg9ZY
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 04 11:09:09 IST 2023
//cookie isSecure-false
//cookie isHttpOnly-false

//cookie name=ud_rule_vars
//cookie value="eJx9jcEOgyAQBX_FcG01yxYU-BYTQgEtqSnpil6M_16TtklPvb68mdlYcTTGEoNd05xKJqMU8HbQKDR44TulsBOogtRShthyaXzO9xSZqdjWsyHRXN6sDa7E_th7hoBYg6pBVCDNRRvQTacPlToBGICenY_X5A605MXfbCE3DMnbOS_ko10dJXedPrZMo3sk_wNRfC5x_lvk0CByBPkt7mx_AQ03Rww=:1oJTZe:0MY6miI2hIuxCjcP_o3XmN2ZUCA"
//cookie domain-www.udemy.com
//cookie Expiry-Sat Aug 03 11:09:09 IST 2024
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=seen
//cookie value=1
//cookie domain-www.udemy.com
//cookie Expiry-Thu Aug 04 11:39:09 IST 2022
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=ud_cache_logged_in
//cookie value=0
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=__udmy_1_a12z_c24t
//cookie value=VGhlIGFuc3dlciB0byBsaWZlLCB0aGUgdW5pdmVyc2UsIGFuZCBldmVyeXRoaW5nIGlzIDQy
//cookie domain-.udemy.com
//cookie Expiry-Fri Aug 04 11:09:09 IST 2023
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=evi
//cookie value="3@IWhc4eOhFWsrrW1TBB_dOc0ajIiE_UgSHm2AA9zbAWDWGXjFaJVyY7F5"
//cookie domain-www.udemy.com
//cookie Expiry-Sat Sep 03 11:09:09 IST 2022
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=ud_cache_release
//cookie value=d282da9e781047fd9d79
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=csrftoken
//cookie value=uxqrARDUO0RskQ0EoUdlIltGgf6BWRQyfW3xvUlRFAgkdRKxr4KTnhDTE3mLEI8d
//cookie domain-www.udemy.com
//cookie Expiry-Thu Aug 03 11:09:09 IST 2023
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=ud_cache_version
//cookie value=1
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=ud_cache_campaign_code
//cookie value=PPENVDOTB
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=ud_cache_brand
//cookie value=INen_US
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=__cfruid
//cookie value=29edfde194621cfc7d39de43c95edbc9617e298f-1659591550
//cookie domain-.udemy.com
//cookie Expiry-null
//cookie isSecure-true
//cookie isHttpOnly-true
//cookie name=ud_cache_language
//cookie value=en
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=__cf_bm
//cookie value=Kz2xBdd8LwDsvAObM2DLGr4wxLbqYjMFda.V.syv.ko-1659591551-0-AdcaTFVNlSRcCNrpicv0k+dwOIk2onZfZ0kKgkZUccReBuqANIhBU1a++k7/HH/tgYVmOD3G5WOJbGLJcAXsBm9azBJ0P4JRr05sMNKQsiMyWJPdfbSkRIifBlO/kBBEqWtgXuitIM8z8M49jkT2rPF4yCpmFHGrQGoLPv0k15YqD5wLglxt2flr6R0127DTzw==
//cookie domain-.udemy.com
//cookie Expiry-Thu Aug 04 11:39:11 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-true
//cookie name=ud_cache_device
//cookie value=None
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=ud_cache_modern_browser
//cookie value=1
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=__udmy_2_v57r
//cookie value=88016f92490c4c78827428d5955de615
//cookie domain-.udemy.com
//cookie Expiry-Fri Aug 04 11:09:09 IST 2023
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=OptanonConsent
//cookie value=isGpcEnabled=0&datestamp=Thu+Aug+04+2022+11%3A09%3A11+GMT%2B0530+(India+Standard+Time)&version=6.38.0&isIABGlobal=false&hosts=&consentId=ed6748fd-5571-4b8b-9993-826142111e22&interactionCount=0&landingPath=https%3A%2F%2Fwww.udemy.com%2F&groups=C0003%3A1%2CC0005%3A1%2CC0004%3A1%2CC0001%3A1%2CC0002%3A1
//cookie domain-.www.udemy.com
//cookie Expiry-Fri Aug 04 11:09:11 IST 2023
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=_gid
//cookie value=GA1.2.694662666.1659591552
//cookie domain-.udemy.com
//cookie Expiry-Fri Aug 05 11:09:11 IST 2022
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=ud_cache_marketplace_country
//cookie value=IN
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
//cookie name=_gat
//cookie value=1
//cookie domain-.udemy.com
//cookie Expiry-Thu Aug 04 11:10:11 IST 2022
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=_ga
//cookie value=GA1.2.693835625.1659591552
//cookie domain-.udemy.com
//cookie Expiry-Sat Aug 03 11:09:11 IST 2024
//cookie isSecure-false
//cookie isHttpOnly-false
//cookie name=ud_cache_user
//cookie value=""
//cookie domain-www.udemy.com
//cookie Expiry-Fri Aug 05 11:09:09 IST 2022
//cookie isSecure-true
//cookie isHttpOnly-false
