package assignment.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	WebElement eleUsername = driver.findElement(By.id("username"));
	eleUsername.sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	driver.findElement(By.name("phoneCountryCode")).clear();
	driver.findElement(By.name("phoneCountryCode")).sendKeys("+");
	driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
	driver.findElement(By.name("phoneNumber")).sendKeys("987654321");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	driver.findElement(By.linkText("18224")).click();
	driver.findElement(By.linkText("Delete")).click();
	
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("id")).sendKeys("18224");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	WebElement Element = driver.findElement(By.xpath("//div[text()='No records to display']"));
	String txt = Element.getText();
	String str = "No records to display";
	if (str.equals(txt)) {
		System.out.println("Record is Deleted");
	}
}

}