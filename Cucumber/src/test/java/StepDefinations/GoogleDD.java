package StepDefinations;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

public class GoogleDD {


@Given("^User Opens (.*) test$")
public void user_opens_firefox_test(String br) {
    
    System.out.println(br);
}

@Then("^Verify Page$")
public void verify_page() {
    System.out.println("Page Verified");
    
}

}
