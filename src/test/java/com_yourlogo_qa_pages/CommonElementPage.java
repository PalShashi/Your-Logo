package com_yourlogo_qa_pages;

import com_yourlogo_qa_utils.RandomHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonElementPage {
    // all webElements

    WebDriver driver;
    @FindBy(how = How.CSS, using = "a[ title ='View my shopping cart']")
    WebElement cart;

    @FindBy(xpath = "//b[text()='Cart']")
    WebElement Cart;

    @FindBy(css = "div#contact-link")
    WebElement contactUsLink;

    @FindBy(css = "form#searchbox")
    WebElement searchBox;

    @FindBy(css = "div>ul>li>a[title='Women']")
    WebElement womenTab;

    @FindBy(css = "div>ul>li>a[title='Dresses']")
    WebElement dressesTab;

    @FindBy(css = "div>ul>li>a[title='T-shirts']")
    WebElement tShirtsTab;

    @FindBy(css = "i.icon-home")
    WebElement returnToHome;

    @FindBy(css = "div#block_top_menu>ul>li")
    List<WebElement> mainCategoryTabs;


    public CommonElementPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String selectCategoryTab() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElements(mainCategoryTabs));
        List<WebElement> CategoryTabs = mainCategoryTabs;
        int tabsSize = CategoryTabs.size();
        if (tabsSize == 0) {
            System.out.println(" I have no tab for you ");
        }
        int randomIndex = new RandomHelper().generateRandomNumber(tabsSize);
        WebElement categorytab = CategoryTabs.get(randomIndex);

        String categoryName =categorytab.getText();

        System.out.println("No of tabs presents are = "+ tabsSize + "\n" + " and clicked tab name is = " +categoryName);

        categorytab.click();

        return categoryName;


    }

    public String pageTitle(){
        return driver.getTitle();
    }
}
