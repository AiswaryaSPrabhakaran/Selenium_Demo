package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement enb= driver.findElement(By.name("userName"));
		if (enb.isEnabled())
		{
			enb.sendKeys("sunil");
			enb.clear();
			enb.sendKeys("sunil");
		}
		if(driver.findElement(By.name("userName")).isEnabled())
		{
			driver.findElement(By.name("password")).sendKeys("sunil");
			driver.findElement(By.name("login")).click();
		}
		if(driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected())
		{
			driver.findElement(By.xpath("//*[@value='oneway']")).click();
		}
	}
}
