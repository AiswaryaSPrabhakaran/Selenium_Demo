package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//WebElement link = driver.findElement(By.linkText("Car Rentals")); //--- Either this command or below command
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Car Rentals')]"));
		
		//----Click operation with Actions and Action command
		Actions build = new Actions(driver);
		Action moveover = build.moveToElement(link).build();
		moveover.perform();
		build.sendKeys(link,(Keys.ENTER)).perform();
			
		WebElement back = driver.findElement(By.xpath("//*[@href='mercurywelcome.php']"));
		
		//----Click operation with Actions and Action command
		Actions build1 = new Actions(driver);
		Action moveover1 = build1.moveToElement(back).build();
		moveover1.perform();
		build.sendKeys(back,(Keys.ENTER)).perform();
		

	}

}
