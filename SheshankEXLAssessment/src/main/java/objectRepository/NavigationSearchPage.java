package objectRepository;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationSearchPage {
	
	public WebDriver driver;
	
	By searchbox =By.cssSelector("input#searchboxinput");	
	By directions=By.xpath("//div[@data-value='Directions']/button");
	By sourcesearch=By.xpath("//div[@id='sb_ifc51']/input[@class='tactile-searchbox-input']");
	By searchresults=By.xpath("//div[@class='section-layout']/div");
	By directiontitle=By.xpath("//h1[@class'section-directions-trip-title'][1]/span[1]");
	By directiontimestamp=By.xpath("//div[@class='section-directions-trip-description']/div//div[@class='section-direction-tripnumbers']/div[1]/span[1]");
	By directionmiles=By.xpath("//div[@class='section-directions-trip-numbers']/div[2]/div");
	

	public NavigationSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSearchbox()
	{
		return driver.findElement(searchbox);
	}
	
	public WebElement getSearchDirections()
	{
		return driver.findElement(directions);
	}
	
	public WebElement getSourceSearch()
	{
		return driver.findElement(sourcesearch);
	}
	
	public int getSearchResults()
	{
		return driver.findElements(searchresults).size();
	}
	
	
	public WebElement getdirectionTitle()
	{
		return driver.findElement(directiontitle);
		
	}
	
	public WebElement getdirectionTime()
	{
		return driver.findElement(directiontimestamp);
		
	}
	
	public WebElement getdirectionMiles()
	{
		return driver.findElement(directionmiles);
		
	}

}
