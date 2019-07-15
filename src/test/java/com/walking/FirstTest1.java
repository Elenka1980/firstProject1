package com.walking;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstTest1 extends com.wagwalking.BaseTest {

    @Test
    public void testFirst() {

        WebElement walkFreeButon = driver.findElement(By.cssSelector(".sc-ifAKCX.bCMkWd"));
        walkFreeButon.click();

        WebElement emailFild = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        emailFild.sendKeys("a");

        WebElement passwardFild = driver.findElement(By.cssSelector("input[type = \"password"));
        passwardFild.sendKeys("b");

        WebElement firstNameFild = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));
        firstNameFild.sendKeys("d");

        WebElement lastNameFild = driver.findElement(By.cssSelector("input[name = \"lastName"));
        lastNameFild.sendKeys("s");

        WebElement cellPhoneFild = driver.findElement(By.cssSelector("input[type = \"tel"));
        cellPhoneFild.sendKeys("n");


    }


}
