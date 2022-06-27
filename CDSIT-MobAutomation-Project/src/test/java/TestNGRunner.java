import com.appium.utility.TestNGCucumberExecutable;
//import com.utility.LogCapture;
//import com.utility.SendMail;
//import org.testng.annotations.AfterSuite;
import cucumber.api.CucumberOptions;

@CucumberOptions(

		// features = { "@target/rerun.txt" }, //To run failed features scenario

		features = { "src/Feature/" },

		glue = { "com.cucumber.stepdefinition" }, strict = false, dryRun = false,

		 tags = { "@CDLoginForJenkins" },
		 
		 //Jenkins Tag @CDLoginForJenkins
		 
		 //@CD_PID-3605_TC170,@TorFX_CD_PID-3605_TC170
		 //Reg :@CD_PID-3854_TC10,@CD_PID-3854_TC10,@CD_PID-3854_TC18
		plugin = { "pretty", "html:target/site/cucumber-pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Extentreport.html",
				"rerun:target/rerun.txt" }, monochrome = false)

public class TestNGRunner extends TestNGCucumberExecutable {

}