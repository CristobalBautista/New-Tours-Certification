package com.demoaut.newtours.certification.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.demoaut.newtours.certification.stepdefinitions",
		snippets = SnippetType.CAMELCASE,
		tags = {"@Reserve"}
)
public class NewToursRunner {
}