package homeworkselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASME_system1 {
	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath( "//button[@class='btn btn-primary']")).click();
		 String text1 = driver.findElement(By.xpath( "//a[@class='navbar-brand']")).getText();
		 System.out.println("title of the page:"+text1);
		driver.findElement(By.xpath( "//form[@id='logout-form']/following::a[1]")).click();	 
		driver.close();
	}

}
