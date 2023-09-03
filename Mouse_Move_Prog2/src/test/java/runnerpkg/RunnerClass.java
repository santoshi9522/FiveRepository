package runnerpkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith (Cucumber.class)
@CucumberOptions (features ="features", glue = {"mainpkg"},plugin = {"pretty", "html:target/htmlreports"})


public class RunnerClass {

	
}
