//WAP to upload an image from Actitime application
package FileuploadPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement1 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		File logoImage = new File("./CV/Test.png");
		String logoFullPath = logoImage.getAbsolutePath();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='popup_menu_icon settings_icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logo & Color Scheme")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		Thread.sleep(3000);
		
//		driver.findElement(By.name("formCustomReportLogo.logo")).click();
		
		WebElement browseBtn = driver.findElement(By.name("formCustomInterfaceLogo.logo"));		
		browseBtn.sendKeys(logoFullPath);
		
		driver.findElement(By.className("saveButton")).click();
//		driver.close();
	}

}
