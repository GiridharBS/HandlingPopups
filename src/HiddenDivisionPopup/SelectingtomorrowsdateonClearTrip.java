//WAP to select Tomorrow's date on clear trip site
package HiddenDivisionPopup;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingtomorrowsdateonClearTrip {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
	
		LocalDate tomDate = LocalDate.now().plusDays(1);
		System.out.println(tomDate);
		
		String convertedDate = tomDate.toString();
		String[] extractedDate = convertedDate.split("-");
		String date = extractedDate[2];
		System.out.println(date);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		
		if(date.startsWith("0"))
		{
			String replacedDate = date.replaceAll("0", "");
			driver.findElement(By.linkText(replacedDate)).click();
		}
		else {
			driver.findElement(By.linkText(date)).click();
		}
		
		driver.close();
	}

}
