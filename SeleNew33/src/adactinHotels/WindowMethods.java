package adactinHotels;

import java.lang.reflect.Type;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("http://adactinhotelapp.com/HotelAppBuild2/");
		//how to get the Height of the window
		int a =wd.manage().window().getSize().getHeight();
		
		System.out.println(a);
		//how to get the Width of the window
		int b = wd.manage().window().getSize().getWidth();
		
		System.out.println(b);
		//is used to get window position
		Point d = wd.manage().window().getPosition();
		
		System.out.println(d);
	//is used to get WindowID
   	

		int c = wd.manage().window().hashCode();
		
		System.out.println(c);
		
		Thread.sleep(3000);
		
		wd.manage().window().maximize();
		
		Thread.sleep(3000);
		
		wd.manage().window().fullscreen();
		
		Thread.sleep(3000);
	//is used to get the current methods Web driver class
		Type A = wd.manage().window().getClass();
		
		System.out.println(A);
	//is used to handle the cookies		
		Set<Cookie> e = wd.manage().getCookies();
		
		System.out.println(e);
		
		wd.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
