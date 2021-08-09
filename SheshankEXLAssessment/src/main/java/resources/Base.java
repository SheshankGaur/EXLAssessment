package resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException, InterruptedException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Abhishek\\eclipse-workspace\\SheshankEXLAssessment\\src\\main\\java\\data.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Abhishek\\eclipse-workspace\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		
		else if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek\\eclipse-workspace\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
	
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abhishek\\eclipse-workspace\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
		Thread.sleep(70000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;
	}
	
	
	
}
