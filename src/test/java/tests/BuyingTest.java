package tests;


import org.testng.annotations.Test;
import pages.*;

public class BuyingTest extends BaseTest {

    @Test(priority = 1)
    public void buying() throws InterruptedException {

        HomePage homePage = new HomePage(driver, wait);
        LoginPage loginPage = new LoginPage(driver, wait);
        MyAccountPage myAccountPage = new MyAccountPage(driver, wait);
        CamerasPage camerasPage = new CamerasPage(driver, wait);
        CartPage cartPage = new CartPage(driver, wait);
        CheckoutPage checkoutPage = new CheckoutPage(driver, wait);
        OrderSuccessPage orderSuccessPage = new OrderSuccessPage(driver, wait);

        homePage.goToUserLogin();
        loginPage.loginToTestStore("g2873686@nwytg.com", "123123");
        myAccountPage.goToCameras();
        camerasPage.addToCartTestProduct2();
        camerasPage.addToCartTestProduct3();
        camerasPage.goToShoppingCart();
        cartPage.goToCheckout();
        checkoutPage.existingBillingDetails();
        checkoutPage.existingDeliveryDetails();
        checkoutPage.chooseDeliveryMethod();
        checkoutPage.choosePaymentMethod();
        checkoutPage.confirmOrder();
        orderSuccessPage.continueToHomePage();

        Thread.sleep(500);
        System.out.println("Success");
    }
}
