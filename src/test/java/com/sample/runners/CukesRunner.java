package com.sample.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/sample/step_definitions",
        dryRun = false,
        plugin = {"pretty"},

        tags = "@bbcLogin"
)
public class CukesRunner {
}
