package JavaScriptpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptPopup {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.id("loginbutton")).click();
		Alert alert = driver.switchTo().alert();
		String popupTxt = alert.getText();
		System.out.println(popupTxt);
		
		alert.accept();

	}

}
