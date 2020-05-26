import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticePageSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			//Launch the browser
			WebDriver driver = new ChromeDriver();
			//URL of the page
			driver.get("http://automationpractice.com/index.php");
			//Maximizing the window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			  //Click SignIn 
			driver.findElement(By.xpath("//div[@class='header_user_info']")).click();
			//Create an account
			driver.findElement(By.id("email_create")).sendKeys("vanamalirajeswari10@gmail.com");
			driver.findElement(By.xpath("//i[@class='icon-user left']")).click();		
			driver.findElement(By.id("id_gender2")).click();
			driver.findElement(By.id("customer_firstname")).sendKeys("Vanamali");
			driver.findElement(By.id("customer_lastname")).sendKeys("Rajeswari");
			driver.findElement(By.id("passwd")).sendKeys("Vanamalirajeswari");
			Select s = new Select(driver.findElement(By.id("days")));
			s.selectByValue("29");
			Select s1 = new Select(driver.findElement(By.id("months")));
			s1.selectByValue("10");
			Select s2 = new Select(driver.findElement(By.id("years")));
			s2.selectByValue("1997");
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			driver.findElement(By.id("company")).sendKeys("CG");
			driver.findElement(By.id("address1")).sendKeys("Malikipuram");
			driver.findElement(By.id("address2")).sendKeys("Market road");
			driver.findElement(By.id("city")).sendKeys("Malikipuram");
			//select state
			Select s3 = new Select(driver.findElement(By.id("id_state")));
			s3.selectByVisibleText("Indiana");
			driver.findElement(By.id("postcode")).sendKeys("46077");
			Select s5 = new Select(driver.findElement(By.id("id_country")));
			s5.selectByVisibleText("United States");
			driver.findElement(By.id("phone_mobile")).sendKeys("7680814662");
			WebElement  source = driver.findElement(By.id("alias"));
			source.clear();
			source.sendKeys("Hostel");
			driver.findElement(By.xpath("//span[text()='Register']")).click();
			driver.findElement(By.xpath("//span[text()='My personal information']")).click();
	  

	}

}
