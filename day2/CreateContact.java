package assignment.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class CreateContact {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Ranjani");
		driver.findElement(By.id("lastNameField")).sendKeys("D");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ranjani");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BE");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SoftwareEngineer");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ranju@gmail.com");

		WebElement country = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(country);
		dropDown.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I ensure my details are true");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title = driver.findElement(By.tagName("h2")).getText(); 
		System.out.println(title);
	}

}
