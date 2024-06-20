package com.flipkart.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "C:\\Users\\srika\\eclipse-workspace\\cucumber\\src\\test\\resources\\Features",
                   glue = {"com.flipkartstepdefinition","com.flipkart.Hooks"},
                   tags = "@sanity or @smoke",
                   dryRun = false,
                   monochrome = true,
                   plugin = {"html:target//cucumber//report.html","json:target//cucumber//report1.html"}
                   )

public class TestRunner {

}
