package homeworkselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) {
		
		
		    WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new  ChromeDriver();
		    driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get(    "https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 //div[@class='fields-container section']//input
		   String title = driver.getTitle();
		   System.out.println("title of the page:"+title);
		   
		   WebElement name = driver.findElement(By.xpath(  "//div[@class='fields-container section']//input"));
		   name.sendKeys("aswin" );
		   
		   WebElement lastname = driver.findElement(By.xpath( "//div[@class='lastName textFieldInput section']//input"));
		   lastname.sendKeys("kumar");
		   
		   WebElement email = driver.findElement(By.xpath(  "//div[@class='emailInput textFieldInput section']//input"));
		   
		   email.sendKeys("aswinak0007@gmail.com");
		   
		   
		   WebElement dropdown = driver.findElement(By.xpath(  "//div[@class='userTitle selectFieldInput section']//select"));
		   Select drop1 =new Select(dropdown);
		   drop1.selectByVisibleText("IT Manager");
		   
		   WebElement companyname = driver.findElement(By.xpath(  "//div[@class='field']/input"));
		   companyname.sendKeys("TESTLEAF");
		   
		   WebElement employes = driver.findElement(By.xpath(  "//div[@class='field']/select"));
		   Select drop2 = new Select(employes);
		   drop2.selectByVisibleText("101 - 500 employees");
		   
		   WebElement phonenumber = driver.findElement(By.xpath( "//div[@class='phoneInput textFieldInput section']//input"));
		  
		   phonenumber.sendKeys("8610236914");
		   
		   WebElement country = driver.findElement(By.name("CompanyCountry"));
		   Select drop3= new Select (country);
		   drop3.selectByVisibleText("India");
		   
		   
		   
		   WebElement select = driver.findElement(By.xpath( "//input[@id='SubscriptionAgreement']/following-sibling::div"));
		   select.click();
		   
		   WebElement state = driver.findElement(By.name("CompanyState"));
		   Select drop4 =new Select(state);
		   drop4.selectByVisibleText("Tamil Nadu");
		   
		   
		   
		   if (select.isEnabled()) {
			   System.out.println("checkbox is enabled ");
			   
		   }
		   else
			   System.out.println("not enabled");
		   
		   
		  
		   driver.close();
		   
		   
		   
		   
		   
		   
	}

}
