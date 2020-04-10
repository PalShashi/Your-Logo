package com_yourlogo_qa_pages;

import com_yourlogo_qa_base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserHomePage extends Base {
    public WebDriver driver;


    @FindBy(css = "a[title='Orders']")
    WebElement orderHistory;
    @FindBy(css = "a[title='Credit slips']")
    WebElement creditSlip;
    @FindBy(css = "a[title='Addresses']")
    WebElement myAddress;
    @FindBy(css = "a[title='My wishlists']")
    WebElement myWishlist;

    @FindBy(css= "")
    WebElement  bbb;   ;


    public UserHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


}
