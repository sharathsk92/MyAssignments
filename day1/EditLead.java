package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SharathOne");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RedDevils");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Football");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Theatre of Dreams");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sharathsk1992@gmail.com");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(sourceDD);
		sec.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Matt Butsby Bay, Stretford End");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
