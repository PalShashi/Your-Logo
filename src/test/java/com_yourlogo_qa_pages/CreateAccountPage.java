package com_yourlogo_qa_pages;

import com_yourlogo_qa_base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateAccountPage extends Base {


    WebDriver driver;
    Select select;

    // create account(form) page elements


    @FindBy(css = "input#id_gender1")
    WebElement title;

    @FindBy(css = "input#customer_firstname")
    WebElement firstName;

    @FindBy(css = "input#customer_lastname")
    WebElement lastName;

    @FindBy(css = "input#passwd")
    WebElement createAccountPassword;

    @FindBy(css = "select#days")
    WebElement dob_Days;

    @FindBy(css = "select#months")
    WebElement dob_Months;

    @FindBy(css = "select#years")
    WebElement dob_Years;

    @FindBy(css = "input#newsletter")
    WebElement newsletterCheckbox;

    @FindBy(css = "input#address1")
    WebElement addressField;

    @FindBy(css = "input#city")
    WebElement cityField;
    @FindBy(css = "select#id_state")
    WebElement selectState;

    @FindBy(css = "input#postcode")
    WebElement postcode;

    @FindBy(css = "select#id_country")
    WebElement selectCountry;

    @FindBy(css = "input#phone_mobile")
    WebElement mobileNo;

    @FindBy(id = "submitAccount")
    WebElement submitAccount;

    @FindBy(css = "input#alias")
    WebElement aliasRefrence;

    @FindBy(xpath = "//h3[text() ='Create an account']")
    WebElement createAccountPagHeader;

    @FindBy(xpath = "//h3[text( ) = 'Your personal information']")
    WebElement createAccountFormHeader;

    @FindBy(css = "input#address2")
    WebElement addressField2;

    @FindBy(css = "textarea#other")
    WebElement additionalInfo;

    @FindBy(tagName = "ol")
    WebElement errorMessageMandatoryField;

    @FindBy(css = "ol>li")
    WebElement errorMessageExistedEmailid;


    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    public String createAccountHeader() {
        return createAccountPagHeader.getText();
    }


    public String accounFormHeader() {
        return createAccountFormHeader.getText();

    }

    public void selecTitle() {
        title.click();

    }

    public void enterFirstAndLastName(String f_name, String l_Name) {

        firstName.sendKeys(f_name);
        lastName.sendKeys(l_Name);
    }

    public void createPassword(String password) {
        createAccountPassword.sendKeys(password);
    }

    public void enterDateOfBirth() {
        //select dob date
        select = new Select(dob_Days);
        select.selectByValue("15");

        // select dob month
        select = new Select(dob_Months);
        select.selectByIndex(5);

        //select dob year
        select = new Select(dob_Years);
        select.selectByValue("1996");

    }

    public void selectNewsLetterCheckBox() {
        newsletterCheckbox.click();
    }

    public void address(String add, String c_Name, String p_Code) {
        addressField.sendKeys(add);
        cityField.sendKeys(c_Name);
        postcode.sendKeys(p_Code);
    }

    public void selectStateAndCountry() {
        select = new Select(selectState);
        select.selectByVisibleText("California");

        select = new Select(selectCountry);
        select.selectByVisibleText("United States");
    }

    public void setMobileNoNumberAndAliasRefrence(String mob_Number, String ref) {
        mobileNo.sendKeys(mob_Number);
        aliasRefrence.sendKeys(ref);
    }

    public void submitAccountRegistrationForm() {
        submitAccount.click();

    }

    public void addressline2(String add) {
        addressField2.sendKeys(add);
    }

    public void additionalInformation(String info) {
        additionalInfo.sendKeys(info);
    }

    public List<WebElement> mandatoryFieldErrorMessage() {
        List<WebElement> error = errorMessageMandatoryField.findElements(By.tagName("li"));
        return error;
    }

    public String existedEmailidErrorMessage() {
        return errorMessageExistedEmailid.getText();

    }
}
