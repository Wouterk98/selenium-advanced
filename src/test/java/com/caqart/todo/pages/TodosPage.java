package com.caqart.todo.pages;

import com.caqart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodosPage extends BasePage{

    public TodosPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(css = "[data-testid=welcome]")
    private WebElement txt_welcomeMessasge;

    @FindBy(css = "[data-testid=add]")
    private WebElement btn_add;



    // Actions or methods
    public boolean isWelcomeDisplayed(){
        return txt_welcomeMessasge.isDisplayed();
    }

    public NewTodoPage openNewTodoPage(){
        btn_add.click();
        return new NewTodoPage(driver);
    }


}
