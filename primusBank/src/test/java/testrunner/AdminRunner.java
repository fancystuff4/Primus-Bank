package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/admin.feature",glue="function",dryRun=false
,tags = ("@tag6"),
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/LoginTestReport.html"})
public class AdminRunner extends AbstractTestNGCucumberTests 
{

}

