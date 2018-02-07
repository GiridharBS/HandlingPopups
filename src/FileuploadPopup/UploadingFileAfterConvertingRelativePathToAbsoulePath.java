package FileuploadPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFileAfterConvertingRelativePathToAbsoulePath {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		String expectedSuccessMsg = "File uploaded successfully";
		
		File resume = new File("./CV/test.docx");
		String resumePath = resume.getAbsolutePath();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		WebElement uploadBtn = driver.findElement(By.id("input_resumeParser"));
		uploadBtn.sendKeys(resumePath);
		
		Thread.sleep(4000);
		
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
