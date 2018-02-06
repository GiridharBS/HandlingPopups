package FileuploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandligFileUploadPopUp {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		WebElement uploadResume = driver.findElement(By.name("uploadCV"));
		uploadResume.sendKeys("C:\\Users\\giridharb\\Desktop\\Test.docx");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
