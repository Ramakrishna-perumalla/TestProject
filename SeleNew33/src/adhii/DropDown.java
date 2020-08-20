package adhii;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.List;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd=new FirefoxDriver();
		
		wd.get("http://demo.automationtesting.in/Register.html");
		
		wd.findElement(By.xpath("//select[@id='Skills']"));
		
		WebElement element = wd.findElement(By.xpath("//select[@id='Skills']"));
		
		Select sel = new Select(element);
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("Android");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("APIs");
		
		Thread.sleep(2000);
		
		WebElement first = sel.getFirstSelectedOption();
		
		System.out.println("The first selected element is"+first.getText());
		
		
		
		List<WebElement> ram = sel.getAllSelectedOptions();
		
		for (WebElement webElement : ram) {
			
			System.out.println("The selected elements are"+webElement.getText());
			
			}
		
		List<WebElement> elem = sel.getOptions();
		
		 for (WebElement webElement : elem) {
			 
			 System.out.println("the all options are"+webElement.getText());
			
		}
		
		 
		 sel.deselectAll();
		wd.close();
		
	
		
		
		
		
	}

}
