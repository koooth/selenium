/*3rd review

import org.openqa.selenium.WebDriver;

package tests;
import org.junit.Assert;
import pageObjects.Login;
public class GetData {
    WebDriver driver_;

    public void runAll(String loginvalue, String passwordvalue){
        Login loginelements = new Login(driver_);
        loginelements.setLogin(loginvalue);
        loginelements.setPassword(passwordvalue);
        loginelements.clickLogin();
        Assert.assertTrue(loginelements.isLogged());
    }
}*/
