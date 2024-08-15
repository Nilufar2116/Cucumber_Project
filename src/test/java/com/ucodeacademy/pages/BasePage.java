package com.ucodeacademy.pages;

import com.ucodeacademy.utility.Driver;
import com.ucodeacademy.utility.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends Wait {

    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    public void clickOn(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    //create a method that take a web element and returns its text as String
    public String getTextOfWebElement(WebElement element){
        //wait for web element to be visible then get the text
        wait.until(ExpectedConditions.visibilityOf(element)).getText();
        return element.getText();
    }

}
