package cucumberStepDefinitions;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import objectRepository.NavigationSearchPage;
import resources.Base;


@RunWith(Cucumber.class)
public class GoogleNavigationStepDefinition extends Base{
	
	public WebDriver driver;
	
		@Given("^Launch Chrome Browser and maximize the window$")
	    public void launch_chrome_browser_and_maximize_the_window() throws Throwable {
			driver=initializeDriver();
	    }

	    @And("^Navigate to \"([^\"]*)\";$")
	    public void navigate_to_something(String testurl) throws Throwable {
	        driver.get(testurl);
	    }
	    
	    @When("^Enter San Francisco in search box and hit enter key$")
	    public void enter_san_francisco_in_search_box_and_hit_enter_key() throws Throwable  {
	       NavigationSearchPage page=new NavigationSearchPage(driver);
	       page.getSearchbox().sendKeys("San Francisco, CA, USA" + Keys.ENTER);
	       
	    }
	      
	    @Then("^Validate the San Francisco cordinates$")
	    public void validate_the_san_francisco_cordinates() throws Throwable {
	    	String currurl=driver.getCurrentUrl();
	    	//https://www.google.com/maps/place/San+Francisco,+CA,+USA/@38.8078181,-122.8623879,8z/data=!4m5!3m4!1s0x80859a6d00690021:0x4a501367f076adff!8m2!3d37.7749295!4d-122.4194155
	     String lat=currurl.substring(58,68);
	     String longitude=currurl.substring(70,81);
	     
	     System.out.println(lat +" "+ longitude);
	     
	     String expectedlat="38.8078181";
	 	String expectedlongitude="-122.8623879";
	     
	    assertEquals(expectedlat, lat);
	    assertEquals(expectedlongitude, longitude);
	     
	    }

	    
	    @Given("^Click on Direction icon$")
	    public void click_on_direction_icon() throws Throwable {
	      
	    	  NavigationSearchPage page=new NavigationSearchPage(driver);
	    	  page.getSearchDirections().click();
	    }
	    
	    @And("^enter Chico CA USA in source address and hit enter key$")
	    public void enter_chicp_ca_usa_in_source_address_and_hit_enter_key() throws Throwable {
	       
	    	NavigationSearchPage page=new NavigationSearchPage(driver);
	    	  page.getSourceSearch().sendKeys("Chico CA USA" + Keys.ENTER);	    }
	    

	    @Then("^validate 2 or more routes are displayed in the search results$")
	    public void validate_2_or_more_routes_are_displayed_in_the_search_results() throws Throwable {
	        
	    	NavigationSearchPage page=new NavigationSearchPage(driver);
	    	
	    	  if(page.getSearchResults()>2) {
	    		  
	    		  System.out.println("Results displayed");
	    		  
	    	  }
	    	  else
	    		  System.out.println("Results failed");
	    }

	   

	    @And("^print the route title, distance in miles and travel time in txt file$")
	    public void print_the_route_title_distance_in_miles_and_travel_time_in_file_called_routestxt() throws Throwable {
	       
	    	
	    	PrintStream output=new PrintStream(new File("C:\\Users\\Abhishek\\eclipse-workspace\\SheshankEXLAssessment\\src\\test\\java\\Result.txt"));
	    	//PrintStream console=System.out;
	    	System.setOut(output);
	    	NavigationSearchPage page=new NavigationSearchPage(driver);
	    	System.out.println(page.getSearchResults());
	    }

	}	

