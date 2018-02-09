package FileDownloadPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='REPORTS']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Monthly Team Performance']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[contains(text(),'Export to CSV')]")).click();
		Thread.sleep(5000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

	}

}
