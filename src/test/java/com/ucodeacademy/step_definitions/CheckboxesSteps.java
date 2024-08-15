package com.ucodeacademy.step_definitions;

import com.ucodeacademy.pages.CheckboxesPage;
import com.ucodeacademy.utility.ConfigReader;
import com.ucodeacademy.utility.Driver;
import com.ucodeacademy.utility.Wait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckboxesSteps {

    CheckboxesPage checkboxesPage = new CheckboxesPage();


    @Given("User is navigating to the checkboxes page")
    public void user_is_navigating_to_the_checkboxes_page() {
        String url = ConfigReader.getProperty("checkboxes_url");
        Driver.getDriver().get(url);

        Wait.waitForGivingTime(5);


    }
    @Given("User confirms checkbox 1 is not selected by default")
    public void user_confirms_checkbox_is_not_selected_by_default(Integer int1) {

        Assert.assertFalse("Checkbox 1 is not selected by default", checkboxesPage.checkbox1.isSelected());


    }
    @Then("User should confirm checkbox 2 is not selected by default")
    public void user_should_confirm_checkbox_is_not_selected_by_default(Integer int1) {

        Assert.assertTrue("Checkbox 2 is selected by default", checkboxesPage.checkbox2.isSelected());


    }
    @When("User clicks checkbox 1 to select it")
    public void user_clicks_checkbox_to_select_it(Integer int1) {
        checkboxesPage.checkbox1.click();


    }
    @When("User clicks checkbox 2 to deselect it")
    public void user_clicks_checkbox_to_deselect_it(Integer int1) {
        checkboxesPage.checkbox2.click();


    }
    @Then("User should confirm checkbox 1 is selected")
    public void user_should_confirm_checkbox_is_selected(Integer int1) {
        Assert.assertTrue("Checkbox 1 is selected", checkboxesPage.checkbox1.isSelected());


    }
    @Then("User should also confirm checkbox 2 is not selected")
    public void user_should_also_confirm_checkbox_is_not_selected(Integer int1) {

        Assert.assertFalse("Checkbox 2 is not selected", checkboxesPage.checkbox2.isSelected());

        //Driver.quitDriver();


    }


}
