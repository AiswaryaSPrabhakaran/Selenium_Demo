package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Opening the Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Opening the FireFox
		/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver driver = new ChromeDriver();*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String Expectedtitle  = "OrangeHRM";
		//driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername'])")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String Actualtitle = driver.getTitle();
		if (Expectedtitle.equals (Actualtitle))
		{
			System.out.println("The Title is same and Logout");
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Logout")).click();
			driver.close();
		}
		else
		{
			System.out.println("The Tile is not same ");
			driver.close();
		
		}	
	}

}
