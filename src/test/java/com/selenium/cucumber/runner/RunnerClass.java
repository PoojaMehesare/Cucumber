package com.selenium.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="SeleniumCucumber/src/test/Features",glue={"cucumberr"})
public class RunnerClass {
}
