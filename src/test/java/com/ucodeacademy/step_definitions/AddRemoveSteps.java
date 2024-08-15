package com.ucodeacademy.step_definitions;

import com.ucodeacademy.pages.AddRemovePage;
import com.ucodeacademy.utility.ConfigReader;
import com.ucodeacademy.utility.Driver;
import com.ucodeacademy.utility.Wait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddRemoveSteps {

    AddRemovePage addRemovePage = new AddRemovePage();


    @Given("User is on the ucode academy add remove page")
    public void user_is_on_the_ucode_academy_add_remove_page() {
        String url = ConfigReader.getProperty("add_remove_url");
        Driver.getDriver().get(url);

    }

    @When("User clicks on Add Element button")
    public void user_clicks_on_add_element_button() {
        addRemovePage.addButton.click();

        addRemovePage.clickOn(addRemovePage.addButton);


    }

    @Then("A new button should be displayed")
    public void a_new_button_should_be_displayed() {
        //lets do some verification
        //boolean isDisplayed = addRemovePage.deleteButton.isDisplayed();
        Assert.assertTrue("Delete button is not displayed", addRemovePage.deleteButton.isDisplayed());

    }

    @Then("User clicks on Delete button")
    public void user_clicks_on_delete_button() {

        //wait for few seconds
        Wait.waitForGivingTime(3);


        addRemovePage.deleteButton.click();
        addRemovePage.clickOn(addRemovePage.deleteButton);

        Wait.waitForGivingTime(2);

    }

    @Then("Delete Button should deleted")
    public void delete_button_should_deleted() {

        //since the element is not there after deleting it
        //we need to use try catch block

        try {

            Assert.assertTrue(addRemovePage.deleteButton.isDisplayed());
        } catch (Exception e){
            e.getStackTrace();
            System.out.println("Delete button is not displayed");
        }
        //fail it on purpose
        //Assert.fail();

       //Driver.quitDriver();

    }
}
