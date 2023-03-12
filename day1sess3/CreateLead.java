package week2.day1sess3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Manchester");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prakash");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RedDevils");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Football");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Theatre of Dreams");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sharathsk1992@gmail.com");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(sourceDD);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
}
