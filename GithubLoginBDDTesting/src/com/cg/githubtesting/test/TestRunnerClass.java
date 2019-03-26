package com.cg.githubtesting.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.cg.githubtesting.stepdefinition"},
		tags= {"@execute"}
		)

public class TestRunnerClass {	
}
