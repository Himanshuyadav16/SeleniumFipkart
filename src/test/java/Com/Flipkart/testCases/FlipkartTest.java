package Com.Flipkart.testCases;

import Com.Flipkart.BaseClass;
import Com.Flipkart.pages.GroceryPage;
import Com.Flipkart.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseClass {

    @Test
    public void homePageTest() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        HomePage homePageClick = new HomePage(driver);
        Thread.sleep(5000);
        homePageClick.cross();
        homePage.groceryImgClick();

    }

    @Test
    public void groceryTest() throws InterruptedException {
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.frontPage();
        HomePage homePageClick = new HomePage(driver);
        Thread.sleep(5000);
        homePageClick.cross();
        homePage.groceryImgClick();
        Thread.sleep(5000);
        GroceryPage groceryPage=new GroceryPage(driver);
        groceryPage.pinCode();
       GroceryPage groceryPageSearch=new GroceryPage(driver);
        groceryPageSearch.search();
        Thread.sleep(5000);
        GroceryPage groceryPagePersonalCare=new GroceryPage(driver);
        groceryPagePersonalCare.personalCare();
    }
}
