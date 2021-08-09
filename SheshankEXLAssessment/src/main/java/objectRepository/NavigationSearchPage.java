package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationSearchPage {
	
	public WebDriver driver;
	
	By searchbox =By.cssSelector("input#searchboxinput");
	By searchbutton=By.cssSelector("button.searchbox-searchbutton");
	By Directions=By.xpath("//div[@data-value='Directions']");
	By sourcesearch=By.id("directions-searchbox-*");
	By searchresults=By.id("section-directions-trip-*");
	By searchtitle=By.id("section-directions-trip-title-*");
	
	
	
	public NavigationSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSearchbox()
	{
		return driver.findElement(searchbox);
	}
	
	
	public WebElement getSearchButton()
	{
		return driver.findElement(searchbutton);
	}
	
	public WebElement getSearchDirections()
	{
		return driver.findElement(Directions);
	}
	
	public WebElement getSourceSearch()
	{
		return driver.findElement(sourcesearch);
	}
	
	public int getSearchResults()
	{
		return driver.findElements(searchresults).size();
	}
	
	
	public WebElement getSearchTitle()
	{
		return driver.findElement(searchtitle);
	}
	
	

}
