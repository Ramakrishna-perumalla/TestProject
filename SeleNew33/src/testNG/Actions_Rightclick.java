package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Rightclick {

	public static void main(String[] args) throws InterruptedException {
	
WebDriver wd = new FirefoxDriver();
		
		
wd.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

//wd.manage().window().maximize();

WebElement element = wd.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

Actions action = new Actions(wd);

action.contextClick(element).build().perform();

WebElement element1 = wd.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']//span[contains(text(),'Copy')]"));

Thread.sleep(3000);

String sra=element1.getText();

System.out.println(sra); //syso

Thread.sleep(2000);

element1.click();

	}

}
