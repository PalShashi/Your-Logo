package com_yourlogo_qa_pages;

import com_yourlogo_qa_base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends Base {
    WebDriver driver;
    Select select;

    // login page elements

    @FindBy(css = "a.login")
    WebElement signinLink;

    @FindBy(css = "input#email")
    WebElement loginEail;

    @FindBy(css = "input#passwd")
    WebElement loginPassword;


    @FindBy(css = "button#SubmitLogin")
    WebElement loginButton;

    @FindBy(linkText = "Forgot your password?")
    WebElement forgotPassword;

    @FindBy(css = "input#email_create")
    WebElement createAnAccountEmailid;

    @FindBy(css = "button#SubmitCreate")
    WebElement createAnAccountButton;

    @FindBy(css = "ol>li")
    WebElement invalidEmailidErrorMessage;

    @FindBy(css = "ol>li")
    WebElement invalidPasswordErrorMessage;


    @FindBy(xpath = "//h3[text() ='Create an account']")
    WebElement createAccountPageHeader;

    @FindBy(xpath = "//h3[text( ) = 'Your personal information']")
    WebElement createAccountFormHeader;

    @FindBy(xpath = "//h1[text() ='Forgot your password?']")
    WebElement forgotPasswordHeader;

    @FindBy(css = "p>button[type='submit']")
    WebElement retrievePasswordButton;

    @FindBy(css = "p.alert.alert-success")
    WebElement resetPasswordConfirmation;

    // constructor and initialize page factory element

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToLogin() {
        signinLink.click();

    }

    public void enterLoginEmailAndPassword(String emaild, String password) {
        loginEail.sendKeys(emaild);
        loginPassword.sendKeys(password);
    }

    public void enterLoginEmailid(String emaild) {
        loginEail.sendKeys(emaild);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public String title() {

        return driver.getTitle();
    }

    public String invalidEmailid() {
        return invalidEmailidErrorMessage.getText();
    }

    public String invalidpassword() {
        return invalidPasswordErrorMessage.getText();
    }

    public void forgotPassword() {
        forgotPassword.click();
    }

    public String forgotPasswordHeader() {
        return forgotPasswordHeader.getText();
    }

    public void retrievePassword() {
        retrievePasswordButton.click();
    }

    public String passwordResetMessage() {
        return resetPasswordConfirmation.getText();
    }


    public String createAccountPageHeader() {

        return createAccountPageHeader.getText();
    }

    public void createAnAccountEmailId(String emailid) {

        createAnAccountEmailid.sendKeys(emailid);
    }

    public void clickOnCreateAccountButton() {
        createAnAccountButton.click();
    }

    public String accounFormHeader() {
        return createAccountFormHeader.getText();

    }



}
