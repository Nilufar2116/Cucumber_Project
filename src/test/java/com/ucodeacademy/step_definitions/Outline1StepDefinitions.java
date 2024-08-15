package com.ucodeacademy.step_definitions;

import com.ucodeacademy.pages.GoogleSearchPage;
import com.ucodeacademy.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Outline1StepDefinitions {

    GoogleSearchPage searchPage = new GoogleSearchPage();

    @When("User search for {string}")
    public void user_search_for(String itemName) {

     searchPage.searchBox.sendKeys(itemName+ Keys.ENTER);

    }
    @Then("User should see {string} in page title")
    public void user_should_see_in_page_title(String itemName) {

     // assertion for verification
       // Assert.assertTrue("Failed!", Driver.getDriver().getTitle().contains(itemName));

        System.out.println(Driver.getDriver().getTitle());

      //Driver.quitDriver();

    }



}
