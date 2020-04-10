package com_yourlogo_qa_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"G:/com_yourlogo_pageobjectmodel_withcucumber/src/test/resources/product.feature"},
        glue = {"com_yourlogo_qa_stepdefinitions"},
        dryRun = false,
        monochrome = true,
        strict = true,
        //name = {},
        //tags = {""},
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class RunCukesTest {

}
