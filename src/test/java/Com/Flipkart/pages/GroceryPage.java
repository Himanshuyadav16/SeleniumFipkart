package Com.Flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroceryPage extends BasePage{
   // @FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/input")
   // @FindBy(name = "pincode")
    @FindBy(className ="_166SQN")
    private WebElement pincode;
    @FindBy(className = "_2KpZ6l")
    private WebElement currentLocation;
   // @FindBy(className = "_2KpZ6l._1-fq4G._1DW8Xs._3dESVI")
   @FindBy(xpath = "//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/form/div/div/div[2]/button")
    private WebElement okButton;
   @FindBy(className = "_3704LK")
   private WebElement search;
   @FindBy(css = "path._3tn8iT._34RNph")
   private WebElement afterTypeSearch;

   @FindBy(xpath="//*[@id='container']/div/div[2]/div/div/div[4]/a/div[2]/div/div")
  // @FindBy(xpath="//*[contains(text(),'Personal &  Baby Care')]")
   private  WebElement personalCare;


    @FindBy(xpath="//*[text() = 'Hair Care' ]")
    // @FindBy(xpath="//*[contains(text(),'Personal &  Baby Care')]")
    private  WebElement hair;

    public GroceryPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void  pinCode() throws InterruptedException {
        pincode.sendKeys("452004");
        Thread.sleep(5000);
        currentLocation.click();
        Thread.sleep(3000);
        okButton.click();
    }
    public void search(){
        search.click();
        search.sendKeys("aata");
        afterTypeSearch.click();
    }
    public void personalCare(){
        Actions a = new Actions(driver);
        a.moveToElement(personalCare);
        a.moveToElement(hair).click();


    }


}
