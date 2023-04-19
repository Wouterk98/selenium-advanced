package com.caqart.todo.base;

import com.caqart.todo.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = DriverFactory.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
