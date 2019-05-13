package Demo1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
//=================Clicking the GMAIL link in www.google.com and opening in a new tab, switching among the tabs==================================//
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
	 	System.out.println("tabs = "+tabs.size());
	 	driver.switchTo().window(tabs.get(1));
	 	Thread.sleep(5000);
	 	driver.switchTo().window(tabs.get(0));
	 	driver.close();
		}
		
	}


