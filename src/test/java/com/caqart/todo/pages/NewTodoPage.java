package com.caqart.todo.pages;

import com.caqart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {

    public NewTodoPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(css = "[data-testid=new-todo]")
    private WebElement inp_newTodo;

    @FindBy(css = "[data-testid=submit-newTask]")
    private WebElement btn_createTodo;

    @FindBy(css = "[data-testid=todo-item]")
    private WebElement txt_todoItem;

    @FindBy(css = "[data-testid=delete]")
    private WebElement btn_delete;

    @FindBy(css = "[data-testid=no-todos]")
    private WebElement txt_noTodos;

    // Actions or methods
    public NewTodoPage addTodo(String todoItem) {
        inp_newTodo.sendKeys(todoItem);
        btn_createTodo.click();
        return this;
    }

    public boolean isTodoDisplayed() {
            return txt_todoItem.isDisplayed();
        }

    public NewTodoPage deleteTodo(){
        btn_delete.click();
        return this;
    }

    public boolean noTodosDisplayed() {
        return txt_todoItem.isDisplayed();
    }

}

