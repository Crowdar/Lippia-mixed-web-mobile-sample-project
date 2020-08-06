package com.crowdar.examples.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.GoogleHomePage;
import com.crowdar.examples.pages.GoogleSearchResultPage;



public class GoogleSteps extends PageSteps {

    private GoogleHomePage homePage;
    private GoogleSearchResultPage searchResultPage;

    public GoogleSteps(RemoteWebDriver driver){
        super(driver);
        homePage = new GoogleHomePage(driver);
        searchResultPage= new GoogleSearchResultPage(driver);
    }

    @Given("The client is in google page")
    public void home(){
    	homePage.go();
    }

    @When("The client search for word (.*)")
    public void search(String criteria){
    	homePage.enterSearchCriteria(criteria);
    	homePage.clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void statVerfication(){
    	Assert.assertTrue(!searchResultPage.getTabs().isEmpty());
	
    }
}
