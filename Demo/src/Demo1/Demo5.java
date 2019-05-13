package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		String underconsTitle = "Under Condtruction : Mercury Tours";
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String [] linkText = new String[linkElements.size()];
		int i=0;
			        //Extract the link texts of each link elements
			        for(WebElement e:linkElements)
			        {
			            linkText[i]= e.getText();
			            i++;
			        }
			        
			        //test each link
			        for(String t:linkText)
			        {
			            driver.findElement(By.linkText(t)).click();
			            if(driver.getTitle().equals(underconsTitle))
			            {
			                System.out.println("\"" +t+ "\"" + "\" + is Under Construction");
			            }
			            else
			            {
			                System.out.println("\"" +t+ "\"" + "\" + is Working");
			            }
			            //driver.navigate().forward();//one step forward
			            //driver.navigate().to("URL");//navigate to the URL
			            driver.navigate().back();//Navigate to one step back
			        }
			        driver.quit();
	}

}
