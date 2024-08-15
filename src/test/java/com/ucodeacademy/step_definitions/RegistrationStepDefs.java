package com.ucodeacademy.step_definitions;

import com.ucodeacademy.pages.RegistrationPage;
import com.ucodeacademy.utility.ConfigReader;
import com.ucodeacademy.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class RegistrationStepDefs {

    RegistrationPage registrationPage =new RegistrationPage();

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        String url = ConfigReader.getProperty("register.url");
        Driver.getDriver().get(url);

    }
    @Given("User enters firstname {string}")
    public void user_enters_firstname(String firstName) {

        registrationPage.firstnameField.sendKeys(firstName);

    }
    @Given("User enters lastname {string}")
    public void user_enters_lastname(String lastName) {

        registrationPage.lastnameField.sendKeys(lastName);

    }
    @Given("User enters username {string}")
    public void user_enters_username(String username) {

        registrationPage.usernameField.sendKeys(username);

    }
    @Given("User enters email {string}")
    public void user_enters_email(String email) {
        registrationPage.emailField.sendKeys(email);

    }
    @Given("User enters password {string}")
    public void user_enters_password(String password) {
        registrationPage.passwordField.sendKeys(password);

    }
    @Given("User enters phone number {string}")
    public void user_enters_phone_number(String phoneNumber) {

        registrationPage.phoneNumber.sendKeys(phoneNumber);

    }
    @Given("User selects gender Female")
    public void user_selects_gender() {
        registrationPage.genderTypeFemale.click();

    }
    @Given("User enters date of birth {string}")
    public void user_enters_date_of_birth(String birthdate) {

        registrationPage.birthDateField.sendKeys(birthdate);

    }
    @Given("User selects Department of Engineering {string} from dropdown")
    public void user_selects_department_of_engineering_from_dropdown(String department) {

        Select select = new Select(registrationPage.departmentDropdown);
        select.selectByValue(department);

    }
    @Given("User selects Job title {string} from dropdown")
    public void user_selects_job_title_from_dropdown(String jobTitle) {
        Select select = new Select(registrationPage.jobTitleDropdown);
        select.selectByVisibleText(jobTitle);
    }
    @Given("User selects programming language {string}")
    public void user_selects_programming_language(String string) {

        registrationPage.languageJava.click();


    }
    @Given("User clicks on Sign up button")
    public void user_clicks_on_sign_up_button() {


    }
    @Then("User should be able to register successfully")
    public void user_should_be_able_to_register_successfully() throws InterruptedException{

        registrationPage.signUpButton.click();

        //verify registration is successfully
        try{
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("registration_confirmation"));

        }catch  (Exception e){
            e.getStackTrace();
            System.out.println(Driver.getDriver().getCurrentUrl());
        }


        Thread.sleep(3000);
        //Driver.quitDriver();


    }
}
