package Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://realestate.upskills.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='http://realestate.upskills.in/my-profile/']")).click();
		driver.findElement(By.name("log")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a/img"));
		
		//Right CLick
		Actions RC = new Actions(driver);
		RC.contextClick(link).build().perform();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println(driver.getCurrentUrl());
		
		//Logout
				/*Select sel1 = new Select(link);
				sel1.selectByVisibleText("Logout");*/
				
	}

}
