package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSteps {
	static WebDriver driver;
	
	@Given("User Opens Browser")
	public void user_opens_browser() {
	    System.setProperty("webdriver.chrome.driver", "C:\\radic workspace\\RadicoCRM\\Drivers\\chromedriver.exe");
	    driver =new ChromeDriver();
    
	}

	@When("Enters URL")
	public void enters_url() {

	   
	 driver.get("https://www.google.com/") ;  
	    
	}

	@Then("User on Google Page")
	public void user_on_google_page() {
	    System.out.println("Verify Google Page");
	    if(driver.getTitle().equals("Google"))
	    {
	    	System.out.println("Google page is Displayed,PASSED");
	    }
	    else
	    {
	    	System.out.println("Google page is not Displayed,FAIL");
	    }
	    throw new io.cucumber.java.PendingException();
	}


	

}
