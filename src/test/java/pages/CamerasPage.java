package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CamerasPage extends BasePage {


    String testProduct2AddToCartButtonXPath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]";
    String testProduct3AddToCartButtonXPath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]";
    String desktopsMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a";
    String camerasMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a";
    String shoppingCartXPath = "//*[@id=\"top-links\"]/ul/li[4]/a";

    public CamerasPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void goToDesktops() {
        driver.findElement(By.xpath(desktopsMenuButtonXPath)).click();
    }

    public void goToCameras() {
        driver.findElement(By.xpath(camerasMenuButtonXPath)).click();
    }

    public void goToShoppingCart() {
        driver.findElement(By.xpath(shoppingCartXPath)).click();
    }

    public void addToCartTestProduct2() {
        driver.findElement(By.xpath(testProduct2AddToCartButtonXPath)).click();
    }
    public void addToCartTestProduct3(){
        driver.findElement(By.xpath(testProduct3AddToCartButtonXPath)).click();
    }
}

