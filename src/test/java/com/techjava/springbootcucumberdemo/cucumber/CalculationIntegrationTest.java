package com.techjava.springbootcucumberdemo.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = {"pretty", "html:target/cucumber"}, glue = {"com.techjava.springbootcucumberdemo.cucumber.stepdefs"})
public class CalculationIntegrationTest {
}
