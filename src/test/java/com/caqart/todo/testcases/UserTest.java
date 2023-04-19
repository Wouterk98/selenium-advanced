package com.caqart.todo.testcases;

import com.caqart.todo.base.BaseTest;
import com.caqart.todo.factory.DriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToSignup(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "iLikeTesting";
        driver.get("https://todo.qacart.com/signup");
        driver.findElement(By.cssSelector("[data-testid=first-name]")).sendKeys(firstName);
        driver.findElement(By.cssSelector("[data-testid=last-name]")).sendKeys(lastName);
        driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("[data-testid=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-testid=confirm-password]")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-testid=submit")).click();
        boolean isWelcomeDisplayed = driver.findElement(By.cssSelector("[data-testid=welcome")).isDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
    }
}
