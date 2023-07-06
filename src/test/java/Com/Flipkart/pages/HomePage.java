package Com.Flipkart.pages;

import Com.Flipkart.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {
    public String baseUrl = ApplicationProperties.INSTANCE.getUrl();
    // @FindBy(xpath ="//*[contains(text(),'Edit or cancel orders')]")
    //  @FindBy(xpath = "//*[(text()='Your Orders','Track packages','Edit or cancel orders')]")

    //  @FindBy(xpath ="//*[contains(text(),'Grocery')]")
    @FindBy(xpath = "//*[@id='container']/div/div[2]/div/div/div[1]/a/div[2]")
    private WebElement groceryClick;
    //  @FindBy(css="button._2KpZ6l._2doB4z")
    @FindBy(xpath = "/html/body/div[2]/div/div/button")
    private WebElement crossAnyWhere;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void frontPage() {
        driver.get(baseUrl);
    }

    public void cross() {
        crossAnyWhere.click();
    }

    public void groceryImgClick() {
        groceryClick.click();
    }

}