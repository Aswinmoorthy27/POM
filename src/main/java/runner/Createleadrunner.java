package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\\\main\\\\java\\\\feature\\\\createlead.feature", glue = {"steps","hooks"}, monochrome = true, publish = true)

public class Createleadrunner extends AbstractTestNGCucumberTests{

}
