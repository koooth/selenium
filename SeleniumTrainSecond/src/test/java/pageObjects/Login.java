package pageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    By loginInput = By.id("username");
    By passInput = By.id("password");
//4th review    By loginButton = By.cssSelector("button.radius");
    By greenMessage = By.id("flash");

    public WebDriver _driver;

    public Login(WebDriver driver){
        _driver = driver;
    }

    public void setLogin(String login){
        _driver.findElement(loginInput).sendKeys(login);
//        driver.findElement(By.cssSelector(loginInput)).sendKeys(login);
    }

    public void setPassword(String password){
        _driver.findElement(passInput).sendKeys(password);
    }

/*4th review    public void clickLogin(){
        _driver.findElement(loginButton).click();
    }*/

    @FindBy(css="button.radius")
    WebElement loginbutton;

    public void clickLogin(){
        loginbutton.click();
    }


    public boolean isLogged(){
        return _driver.findElement(greenMessage).isDisplayed();
    }

    public void runAll(String loginvalue, String passwordvalue){
        setLogin(loginvalue);
        setPassword(passwordvalue);
        clickLogin();
        Assert.assertTrue(isLogged());
    }
}
