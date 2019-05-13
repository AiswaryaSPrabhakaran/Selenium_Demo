package Demo1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AiswaryaSP\\Desktop\\Selenium_Testing\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		String username = driver.findElement(By.name("userName")).getAttribute("value");
		System.out.println(username);
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.xpath("//*[@name='login' and @value='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		WebElement DD1 = driver.findElement(By.name("passCount"));
		WebElement DD2 = driver.findElement(By.name("fromPort"));
		WebElement DD3 = driver.findElement(By.name("fromMonth"));
		WebElement DD4 = driver.findElement(By.name("fromDay"));
		WebElement DD5 = driver.findElement(By.name("toPort"));
		WebElement DD6 = driver.findElement(By.name("toMonth"));
		WebElement DD7 = driver.findElement(By.name("toDay"));
		//Here in this program : To select the option 2 from the drop down Passcount
		Select sel1 = new Select(DD1);
		sel1.selectByVisibleText("2");
		//To print the elements in Dropdown
		List<WebElement> data = sel1.getOptions();
		System.out.println(data.size());
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}
		Select sel2 = new Select(DD2);
		sel2.selectByVisibleText("London");
		Select sel3 = new Select(DD3);
		sel3.selectByVisibleText("March");
		Select sel4 = new Select(DD4);
		sel4.selectByVisibleText("25");
		Select sel5 = new Select(DD5);
		sel5.selectByVisibleText("New York");
		Select sel6 = new Select(DD6);
		sel6.selectByVisibleText("April");
		Select sel7 = new Select(DD7);
		sel7.selectByVisibleText("25");
		driver.findElement(By.xpath("//*[@name='servClass' and @value='First']")).click();
		driver.findElement(By.xpath("//*[@type='image' and @name='findFlights']")).click();
		driver.findElement(By.xpath("//*[@type='image' and @name='reserveFlights']")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Aiswarya");
		driver.findElement(By.name("passLast0")).sendKeys("Prabhakaran");
		driver.findElement(By.name("passFirst1")).sendKeys("Aiswarya");
		driver.findElement(By.name("passLast1")).sendKeys("S P");
		driver.findElement(By.xpath("//*[@type='text' and @name='creditnumber']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//*[@type='checkbox' and @name='ticketLess']")).click();
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input")).click();
		//selecting the multiple checkbox
		List<WebElement> checkbox = driver.findElements(By.name("ticketLess"));
		for(WebElement e :checkbox)
		{
			e.click();
		}
		driver.findElement(By.name("buyFlights")).click();
	}

}
