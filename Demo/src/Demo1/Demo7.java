//===============ORANGE HRM => Performance => Configure => KPIs => Enter=============================


package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		WebElement performance = driver.findElement(By.linkText("Performance"));
		Actions build = new Actions(driver);
		Action click = build.moveToElement(performance).build();
		click.perform();
		build.sendKeys(performance,(Keys.ENTER)).perform();
		WebElement Configure = driver.findElement(By.linkText("Configure"));
		Actions build1 = new Actions(driver);
		Action click1 = build1.moveToElement(performance).build();
		click1.perform();
		build.sendKeys(Configure,(Keys.ENTER)).perform();
		driver.findElement(By.linkText("KPIs")).click();
		//Alternate way as follows
		/*WebElement KPI = driver.findElement(By.linkText("KPIs"));
		Actions build2 = new Actions(driver);
		Action click2 = build1.moveToElement(performance).build();
		click.perform();
		// Alternate way for click as below
		build.sendKeys(KPI,(Keys.ENTER)).perform();*/

	}

}
