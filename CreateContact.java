package homeworkselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("  http://leaftaps.com/opentaps/control/login ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText(  "CRM/SFA")).click();
		  
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("aswin");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		  WebElement dropdown2 = driver.findElement(By.name("dataSourceId"));
		  Select drop3 = new Select (dropdown2);
		  drop3.selectByVisibleText("Conference");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("aswin");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("AK");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/24/1995");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("job");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("450000");
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20");
		  driver.findElement(By.name("description")).sendKeys("inngngignngsngisnggngnengnsnfgngngregerngeigne");
		  WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		  countrycode.clear();
		  countrycode.sendKeys("91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9994071411");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aswinak0007@gmail.com");
		  WebElement dropdown1 = driver.findElement(By.name("generalCountryGeoId"));
		  Select drop2 =new  Select (dropdown1);
		  drop2.selectByVisibleText("India");
		  WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select drop1 = new Select(dropdown);
		  drop1.selectByVisibleText("TAMILNADU");
		  driver.findElement(By.className("smallSubmit")).click();
		  driver.findElement(By.className("subMenuButton")).click();
		  driver.findElement(By.name("description")).clear();
		  driver.findElement(By.name("importantNote")).sendKeys("dsgsgfsgsgfsgdshhgteheh");
		  
		  String title = driver.getTitle();
		  System.out.println("title of the page:" +title );
		  
		  
		 
		  
		  
		
		
	}

}
