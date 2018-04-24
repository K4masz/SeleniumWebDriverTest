package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    String baseURL = "https://rekrutacjaqa2.xsolve.software";

    String desktopsMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a";
    String camerasMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a";
    String shoppingCartXPath = "//*[@id=\"top-links\"]/ul/li[4]/a";
    String registerOptionXPath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a";
    String myAccountDropdownXPath = "//*[@id=\"top-links\"]/ul/li[2]/a";
    String loginOptionXPath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a";
    String checkoutXPath = "//*[@id=\"top-links\"]/ul/li[5]/a";

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void goToTestStore() {
        driver.get(baseURL);
    }

    public void goToDesktops() {
        driver.findElement(By.xpath(desktopsMenuButtonXPath)).click();
    }

    public void goToCameras() {
        driver.findElement(By.xpath(camerasMenuButtonXPath)).click();
    }

    public void goToCheckout() {
        driver.findElement(By.xpath(checkoutXPath)).click();
    }

    public void goToShoppingCart() {
        driver.findElement(By.xpath(shoppingCartXPath)).click();
    }

    public void goToUserRegistration() {
        driver.findElement(By.xpath(myAccountDropdownXPath)).click();
        driver.findElement(By.xpath(registerOptionXPath)).click();
    }

    public void goToUserLogin() {
        driver.findElement(By.xpath(myAccountDropdownXPath)).click();
        driver.findElement(By.xpath(loginOptionXPath)).click();
    }

}
