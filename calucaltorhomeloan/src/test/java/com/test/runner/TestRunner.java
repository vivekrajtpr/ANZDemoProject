package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.home.loan.step.definition"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"})

public class TestRunner {

	}
