package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Login;

public class LoginTests {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/login");
    }

    @Test
    public void loginTest(){
        Login loginPage = new Login(driver);
/*        loginPage.setLogin("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isLogged());*/

        loginPage.runAll();
        driver.close();
    }

}
