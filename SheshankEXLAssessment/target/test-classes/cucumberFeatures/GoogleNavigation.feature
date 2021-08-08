#Author: sheshankgaur03@gmail.com
#Feature: List of scenarios.VERIY PLACE CORDINATES AND VERIFY 2 ROUTES DISPLAYED FOR DESTINATION



Feature: Verifying the driving directions between source i.e. Chico, California and destination i.e. San Francisco, California.
 
  Scenario: Validte the Sanfrancisco Cordinates.
    Given Launch Chrome Browser
    And maximize the window
    And Navigate to "https://www.google.com/maps/";
    When Enter San Francisco in search box
    And click on search icon
    Then Validate the San Francisco cordinates
     
    
   Scenario: Validate the driving directions between Chico, California and San Francisco, California
 		Given Click on Direction icon
 		And enter source location  
 		When click on search icon
 		Then validate 2 or more routes are displayed in the search results
 		And print the route title, distance in miles and travel time in file called routes.txt
 
 
