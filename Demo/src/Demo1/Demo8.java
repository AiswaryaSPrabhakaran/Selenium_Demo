
/////////==============3 Times TAB then Click ENTER================//////////////////

package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Actions button = new Actions(driver);
		button.sendKeys(Keys.ENTER).perform();
		button.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform(); //-- Three times using TAB followed by clicking the ENTER button
			
		
	}

}
