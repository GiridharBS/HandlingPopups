package HiddenDivisionPopup;

import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingTodaysdateonClearTrip {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	
		Date date = new Date();
		System.out.println(date);
		
		String convertedDate = date.toString();
		String[] dateArray = convertedDate.split(" ");
		String extractedDate = dateArray[2];
		System.out.println(extractedDate);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		
		
		if(extractedDate.startsWith("0"))
		{
			String replacedDate = extractedDate.replaceAll("0", "");
			driver.findElement(By.linkText(replacedDate)).click();
		}
		else
		{
			driver.findElement(By.id(extractedDate)).click();
		}
		
		
	}

}
