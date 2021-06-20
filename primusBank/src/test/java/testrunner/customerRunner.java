package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/customer.feature",glue="function",dryRun=false,tags = ("@tag2"),
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/LoginTestReport.html"})
public class customerRunner extends AbstractTestNGCucumberTests 
{

}

