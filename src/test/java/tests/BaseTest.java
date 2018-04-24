package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "E:\\QA\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rekrutacjaqa2.xsolve.software");
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}