package assignment.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dwarsala");
		driver.findElement(By.name("lastname")).sendKeys("Ranjani");
		driver.findElement(By.name("reg_email__")).sendKeys("ranju@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ranju@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("xyzpqrst");
		
		//DOB
		WebElement eledob = driver.findElement(By.name("birthday_day"));
		Select dropDown = new Select(eledob);
		dropDown.selectByIndex(29);

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropDown1 = new Select(month);
		dropDown1.selectByVisibleText("Mar");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropDown2 = new Select(year);
		dropDown2.selectByVisibleText("1997");
		
		//Gender
		
		driver.findElement(By.xpath("//label[@class='_58mt'][1]")).click();	

	}

	
	}


