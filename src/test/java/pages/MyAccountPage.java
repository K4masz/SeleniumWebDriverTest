package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage extends BasePage {

    String desktopsMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a";
    String camerasMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a";

    public MyAccountPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void goToDesktops() {
        driver.findElement(By.xpath(desktopsMenuButtonXPath)).click();
    }

    public void goToCameras() {
        driver.findElement(By.xpath(camerasMenuButtonXPath)).click();
    }
}
