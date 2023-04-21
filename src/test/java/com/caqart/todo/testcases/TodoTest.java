package com.caqart.todo.testcases;

import com.caqart.todo.base.BaseTest;
import com.caqart.todo.pages.SignupPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTest extends BaseTest {

    @Test
    public void shouldBeAbleToAddATodo() throws InterruptedException {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "iLikeTesting";
        String todoItem = faker.book().title();

       boolean isTodoDisplayed = new SignupPage(driver)
                .load()
                .signup(firstName, lastName, email, password)
                .openNewTodoPage()
                .addTodo(todoItem)
               .isTodoDisplayed();
        Assert.assertTrue(isTodoDisplayed);
    }

    @Test
    public void shouldBeAbleToDeleteATodo() throws InterruptedException {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().safeEmailAddress();
        String password = "iLikeTesting";
        String todoItem = faker.book().title();

        boolean noTodosDisplayed = new SignupPage(driver)
                .load()
                .signup(firstName, lastName, email, password)
                .openNewTodoPage()
                .addTodo(todoItem)
                .deleteTodo()
                .noTodosDisplayed();
        Assert.assertTrue(noTodosDisplayed);
    }
}
