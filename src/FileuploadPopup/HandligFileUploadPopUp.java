//WAP to upload an file in Naukri website
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
		driver.get("https://www.naukri.com/");
		
		String expectedSuccessMsg = "File uploaded successfully";
		
		WebElement uploadResume = driver.findElement(By.id("input_resumeParser"));
		uploadResume.sendKeys("E:\\Practise\\BasicAutomation\\HandlingPopups\\CV\\Test.docx");
		
		Thread.sleep(5000);
		
		String actualsuccessMSG = driver.findElement(By.xpath("//span[@class='success']")).getText();
		
		if(actualsuccessMSG.equalsIgnoreCase(expectedSuccessMsg))
		{
			System.out.println("PASS: File uploaded successfully");
		}
		else
		{
			System.out.println("FAIL: File upload was not successful");
		}
		
		driver.quit();
		
		
		
		
	}

}
