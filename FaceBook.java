package homeworkselenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get(" https://en-gb.facebook.com/");
	   String facebook = driver.getTitle();
	   System.out.println("title of the page: "+ facebook );
	   
	 
	   WebElement createaccount = driver.findElement(By.xpath(  " //a[text()='Create New Account']"));
	   createaccount.click();
	   
	   
	   driver.findElement(By.xpath(  "//div[@id='fullname_field']//input")).sendKeys("aswin");
	   
	   WebElement surename = driver.findElement(By.xpath(  "//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input"));
         surename.sendKeys("kumar");
       
         driver.findElement(By.xpath(" //div[@class='mbm _a4y']//input")).sendKeys("9994071411");
       
         WebElement password = driver.findElement(By.xpath( "//div[@class='mbm _br- _a4y']//input"));
         password.sendKeys("sbkifh");
         
          WebElement dropdown1 = driver.findElement(By.xpath( "//select[@id='day']"));
          
          Select drop1 = new Select(dropdown1);
          drop1.selectByVisibleText("24");
          
          WebElement month = driver.findElement(By.xpath(  "//select[@id='month']"));
          Select drop2 = new Select(month);
          drop2.selectByVisibleText("Jun");
          
          WebElement year = driver.findElement(By.xpath( "//select[@id='year']"));
         Select drop3 = new Select(year);
         drop3.selectByValue("1995");
         
         
         WebElement gender = driver.findElement(By.xpath( "//label[text()='Male']"));
         gender.click();
         
         
         
         System.out.println("end    of      FaceBook     program");
         
       
          
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
}
}
