package assignment.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class SalesForce {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Siva");
		driver.findElement(By.name("UserLastName")).sendKeys("Ranjani");
		driver.findElement(By.name("UserEmail")).sendKeys("ranju@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("ExelaTechnologies");
		driver.findElement(By.name("UserPhone")).sendKeys("123456789");

		WebElement eletit = driver.findElement(By.name("UserTitle"));
		Select dropDown = new Select(eletit);
		dropDown.selectByVisibleText("Developer / Software Engineer / Analyst");

		WebElement eleemp = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown1 = new Select(eleemp);
		dropDown1.selectByIndex(4);

		driver.findElement(By.name("SubscriptionAgreement")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
