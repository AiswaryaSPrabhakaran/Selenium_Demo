///////==============3 Times TAB then Click ENTER and then go BACK================//////////////////

package Demo1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Actions button = new Actions(driver);
		button.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		driver.navigate().back(); //--To go back (To use the back button in the chrome page)
	}

}
