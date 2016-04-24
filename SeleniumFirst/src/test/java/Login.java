import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Login {
    @BeforeTest



    @Test
    public void testone() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement searchlink = driver.findElement(By.linkText("Form Authentication"));
        searchlink.click();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");

        WebElement loginbutton = driver.findElement(By.cssSelector("button.radius"));

        Assert.assertTrue(loginbutton.isDisplayed());

        loginbutton.click();



        new WebDriverWait(driver, 10).until(
                ExpectedConditions.urlContains("secure")
        );

        WebElement popup = driver.findElement(By.id("flash"));
        WebElement closepopup = driver.findElement(By.linkText("×"));

        Assert.assertTrue(closepopup.isDisplayed());
        Assert.assertTrue(popup.getText().contains(""));

/*
        Assert.assertTrue(driver.findElement(By.className("icon-lock")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("button secondary radius")).isEnabled());
*/
        driver.close();
    }
}
