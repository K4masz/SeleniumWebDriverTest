package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesktopsPage extends BasePage {

    String desktopsMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a";
    String camerasMenuButtonXPath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a";
    String shoppingCartXPath = "//*[@id=\"top-links\"]/ul/li[4]/a";
    String testProduct1AddToCartButtonXPath = "//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]";
    String testProduct4AddToCartButtonXPath = "//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[2]/button[1]";

    public DesktopsPage(WebDriver driver, WebDriverWait wait) {
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

    public void addToCartTestProduct1() {
        driver.findElement(By.xpath(testProduct1AddToCartButtonXPath)).click();
    }
    public void addToCartTestProduct4(){
        driver.findElement(By.xpath(testProduct4AddToCartButtonXPath)).click();
    }
}


