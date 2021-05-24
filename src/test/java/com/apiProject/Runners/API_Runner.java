package com.apiProject.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//features",
        glue = "com/apiProject/StepDefinitions",
        dryRun = false,
        monochrome = false,
        tags = {"@apiWorkflow"},
        plugin = {"pretty",
                  "html:target/cucumber-default-reports",
                    "rerun:target/FailedTests.txt",
                     "json:target/cucumber.json"
                   }

)
public class API_Runner {

}