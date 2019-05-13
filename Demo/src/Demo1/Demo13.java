package Demo1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		//This is to identify the  parent window
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window : " +parentwindow);
		WebElement Clickbutton = driver.findElement(By.id("button1"));
		
		//To click on the button for 3 times
		for (int i = 0; i<3 ; i++)
		{
			Clickbutton.click();
			Thread.sleep(2000);
		}
		//This is to identify the child window
		List<String> childwindow = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Child Window :" + childwindow);
		String lastwindow = "";
		for (int i =1; i < childwindow.size();i++)
		{
			driver.switchTo().window(childwindow.get(i));
			driver.navigate().to("https://www.google.com");
			lastwindow = childwindow.get(i).toString();			
		}
		//Switching back to my parent window
		driver.switchTo().window(parentwindow);
		driver.navigate().to("http://newtours.demoaut.com//");
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.quit();
		

	}

}
