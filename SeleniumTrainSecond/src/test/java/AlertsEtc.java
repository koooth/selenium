/*
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class AlertsEtc {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://google.ru/");
    }
*/
/*

    @org.testng.annotations.Test
    public void customWaiter(){
        WebElement searchInput = driver.findElement(By.id("lst-ib"));
        searchInput.sendKeys("automation");
        searchInput.sendKeys(Keys.ENTER);

        new WebDriverWait(driver, 5).until(
                new ExpectedCondition<Boolean>(){
                    public Boolean apply(WebDriver webDriver){
                        return webDriver.findElement(By.id("hdtb-msb")).isDisplayed();
                    }
                }
        );

        Assert.assertTrue(driver.getTitle().contains("automation"));
//        driver.close();
        }
    @org.testng.annotations.Test
    public void popupTest() {
        driver.get("http://www.webroot.com/services/popuptester1.htm");
        String parentWindowId = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }


//            Assert.assertTrue(driver.getTitle().contains("automation"));
        Assert.assertTrue(driver.findElement(By.tagName("body")).isDisplayed());
        driver.close();
        driver.switchTo().window(parentWindowId);
        driver.close();
    }
*//*


    @org.testng.annotations.Test
    public void alertExample(){
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();

        Alert alert = driver.switchTo().alert();
        String alertText =alert.getText();
        Assert.assertEquals(alertText, "I am a JS Alert");
        alert.dismiss();

        driver.close();
    }
}
*/
