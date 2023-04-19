package com.caqart.todo.pages;

import com.caqart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage{

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(css = "[data-testid=first-name]")
    private WebElement inp_firstName;

    @FindBy(css = "[data-testid=last-name]")
    private WebElement inp_lastName;

    @FindBy(css = "[data-testid=email]")
    private WebElement inp_email;

    @FindBy(css = "[data-testid=password]")
    private WebElement inp_password;

    @FindBy(css = "[data-testid=confirm-password]")
    private WebElement inp_confirmPassword;

    @FindBy(css = "[data-testid=submit]")
    private WebElement btn_submit;

    // Actions or methods

    public SignupPage load(){
        driver.get("https://todo.qacart.com/signup");
        return this;
    }
    public TodosPage signup(String firstName, String lastName, String email, String password){
        inp_firstName.sendKeys(firstName);
        inp_lastName.sendKeys(lastName);
        inp_email.sendKeys(email);
        inp_password.sendKeys(password);
        inp_confirmPassword.sendKeys(password);
        btn_submit.click();
        return new TodosPage(driver);
    }

}
