package hooks;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_url.ProjectBaseUrl.schoolAdminSetup;

public class Hooks {
    @Before("@api")
    public void setUpApi(){
        schoolAdminSetup();
    }
    @After
    public void tearDownScenario(Scenario scenario){
       if(scenario.isFailed()){
           final byte[] failedScreenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
      scenario.attach(failedScreenshot,"image/png","failed_scenario"+scenario.getName()+"");
      Driver.closeDriver();
       }

    }
}
