package FileDownloadPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFileDownaloadPopUp {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.id("close")).click();
		Thread.sleep(2000);
		
		String xp = "//td[.='Java']/../td[4]/a";
		WebElement l = driver.findElement(By.xpath(xp));
		
		int yAxis = l.getLocation().getY();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,"+yAxis+")", "");
		l.click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(10000);
		
		
		
		driver.close();
	

	}

}
