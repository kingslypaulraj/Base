package ImplementingFeature;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/CreatingALead.feature",
glue= {"ImplementingFeature","hooks"},monochrome=true)

public class RunCucumber {
	
}
