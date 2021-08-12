package objectRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/maps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.id("searchboxinput")).sendKeys("San Francisco, CA" + Keys.ENTER);
		driver.findElement(By.xpath("//div[@data-value='Directions']/button")).click();
		driver.findElement(By.xpath("//div[@id='sb_ifc51']/input[@class='tactile-searchbox-input']")).sendKeys("Chico, CA" + Keys.ENTER);
	
		int resultcount=driver.findElements(By.xpath("//div[@class='section-layout']/div")).size();
		
		System.out.println(resultcount);
		
	/*	int result=driver.findElements(By.id("section-direction-trip-*")).size();
		
		System.out.println(result);
		
		
		}
		
	}

*/
}
}