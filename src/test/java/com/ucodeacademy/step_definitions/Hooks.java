package com.ucodeacademy.step_definitions;

import com.ucodeacademy.utility.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

  /*  @Before (order = 1)
    public void beforeEachScenario(Scenario scenario){
        System.out.println("I run before each scenario 1");
    //    System.out.println(scenario.getName());
    //    System.out.println(scenario.getId());
    //    System.out.println(scenario.getLine());
    //    System.out.println(scenario.getStatus());


    }
    @Before (order = 2)
    public void beforeEachScenario2(Scenario scenario){
        System.out.println("I run before each scenario 2");
    }

    @After
    public void afterEachScenario(Scenario scenario){
        System.out.println("I run after each Scenario 1");
       // System.out.println(scenario.getName());
       // System.out.println(scenario.getId());
       // System.out.println(scenario.getLine());
       // System.out.println(scenario.getStatus());
    }
    @After(order = 2)
    public void afterEachScenario2(Scenario scenario){
        System.out.println("I run after each Scenario 2");
    }
    //run before specific scenario
    @Before(value = "@addition")
    public void beforeSpecificScenario(Scenario scenario){
        System.out.println("I run before the scenario that has @addition");
    }

   */

    //run After specific scenario

 /*   @After(value = "@addition")
    public void afterSpecificScenario(Scenario scenario){
        System.out.println("I run after the scenario that has @addition");
    }

  */

/*    @BeforeStep
    public void beforeEachStep(Scenario scenario){
        System.out.println("I run before each step in scenario");
    }

    @AfterStep
    public void afterEachStep(Scenario scenario){
        System.out.println("I run after each step in scenario");


    }

 */
    //below we'll use @After to take a screenshot if a scenario/step fails

    @After
    public void screenshotOfFailedScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            //cast driver to TakeScreenshot type to take screenshot and store it in byte[]
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

        @After
        public void tearDown(){
            Driver.quitDriver();
        }

    //below we'll use @AfterStep to take a screenshot of each step
    @AfterStep
    public void takeScreenshot(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }




}
