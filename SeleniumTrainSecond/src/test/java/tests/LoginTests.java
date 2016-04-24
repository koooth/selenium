package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
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
//2nd review        Login loginPage = new Login(driver);
/*1st review        loginPage.setLogin("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isLogged());*/

//2nd review        loginPage.runAll();

//3rd review      GetData page = PageFactory.initElements(driver, GetData.class);

        Login page = PageFactory.initElements(driver, Login.class);
        page.runAll("tomsmith", "SuperSecretPassword!");
        driver.close();
    }

}
