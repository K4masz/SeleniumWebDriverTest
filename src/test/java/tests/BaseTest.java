package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:9515"),capability);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.get("https://rekrutacjaqa2.xsolve.software");
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
