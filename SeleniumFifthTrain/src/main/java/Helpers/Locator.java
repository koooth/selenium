package Helpers;


import org.openqa.selenium.By;

import java.io.InputStream;
import java.util.Properties;

import static Helpers.Locator.LocatorType.*;

public class Locator {
    public static final Properties locators;

//enum of locator types
    private enum LocatorType{
        id, name, css, tag, text, xpath, partText
    }

//load locators properties
    static {
        locators = new Properties();
        InputStream stream = Locator.class. getResourceAsStream("/locators.properties");
        try{
            locators.load(stream);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static String title(String pageName){
        return locators.getProperty(pageName);
    }

    public static By get(String locatorName){
        String propertyValue = locators.getProperty(locatorName);
        return getLocator(propertyValue);
    }

    // defining locator type from properties
    private static By getLocator(String locator){
        String[] locatorItems = locator.split("=", 2);
        LocatorType locatorType = LocatorType.valueOf(locatorItems[0]);

        switch (locatorType)
        case id:
            return By.id(locatorItems[1]);

        case name:
            return By.name(locatorItems[1]);

        case css:
        return By.cssSelector(locatorItems[1]);

        case tag:
        return By.tagName(locatorItems[1]);

        case xpath:
        return By.xpath(locatorItems[1]);

        case text:
        return By.linkText(locatorItems[1]);

        case partText:
        return By.partialLinkText(locatorItems[1]);

        default:
            throw new IllegalArgumentException("No such locatro type");
    }


}
