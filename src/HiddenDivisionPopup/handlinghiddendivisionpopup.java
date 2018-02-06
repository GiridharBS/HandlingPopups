package HiddenDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlinghiddendivisionpopup {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='taskRowsTable']//div[@class='img'][1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("deleteTaskPopup_deleteConfirm_submitTitle")).click();
		
		
		
		
		driver.quit();

	}

}
