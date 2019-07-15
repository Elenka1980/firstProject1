package com.wagwalking;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BIConversion.User user;

    @Before

    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elena\\Desktop\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        System.out.println("Start");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        Assert.assertEquals(expectedTitle, actualTitle);

        user = new BIConversion.User();
    }

    @After
    public void quit() {
        System.out.println("Finish");
        driver.quit();

    }

    //I added some code
}
