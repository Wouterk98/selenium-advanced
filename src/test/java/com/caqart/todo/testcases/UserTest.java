package com.caqart.todo.testcases;

import com.caqart.todo.base.BaseTest;
import com.caqart.todo.pages.SignupPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test
    public void shouldBeAbleToSignup(){
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "iLikeTesting";

        boolean isWelcomeDisplayed = new SignupPage(driver)
                .load()
                .signup(firstName, lastName, email, password)
                .isWelcomeDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);
    }
}
