import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

    public WebDriver driver;
    public static final String AUTOMATE_USERNAME = "kmtarek_4mLpQK";
    public static final String AUTOMATE_ACCESS_KEY = "sWbGegEQbmc2q6JmdCVs";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeClass
    public void setupDriver() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "88.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
        caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
        driver = new RemoteWebDriver(new URL(URL), caps);

    }

    @Test
    public void loginTest(){
    driver.get("https://demo.opencart.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.close();
}


}
