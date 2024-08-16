package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import utilities.driverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"}
)
public class testRunner {

    /*

    @BeforeClass
    public static void setUp() throws Exception {
        String platform = System.getProperty("platform", "android");
        driverManager.initializeDriver(platform);
    }

    @AfterClass
    public static void tearDown() {
        driverManager.quitDriver();
    }

    */

}

