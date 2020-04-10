package com_yourlogo_qa_stepdefinitions;

import com_yourlogo_qa_base.Base;

import java.util.Properties;

import com_yourlogo_qa_pages.CommonElementPage;
import com_yourlogo_qa_pages.LoginPage;
import com_yourlogo_qa_pages.WomenPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;

public class ProductsSteps {
    private Base base;
    private Properties prop;
    public WebDriver driver;
    private LoginPage loginPage;
    private CommonElementPage commonElementPage;
    private WomenPage womenPage;

    @Before
    public void setUp() {
        base = new Base();
        prop = base.property();
        driver = base.browser();
        loginPage = new LoginPage(driver);
        commonElementPage = new CommonElementPage(driver);
        womenPage = new WomenPage(driver);

    }

    @After
    public void tearDown() {

        driver.close();
    }

    // to select product category
    @Given("^user is on user home page$")
    public void user_is_on_user_home_page() {
        loginPage.goToLogin();
        loginPage.enterLoginEmailAndPassword(prop.getProperty("username"), prop.getProperty("password"));
        loginPage.clickOnLoginButton();

    }

    @When("^user clicked on any category link tab$")
    public void user_clicked_on_any_category_link_tab() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        commonElementPage.selectCategoryTab();


    }

    @Then("^user should landed on selected category page$")
    public void user_should_landed_on_selected_category_page() {
        String categoryPageTitile = base.getTitle();
        String tabname = womenPage.categoryHeader();
        assertThat(categoryPageTitile, is(containsString(tabname)));
        //assertThat(categoryPageTitile, is(equalToIgnoringCase(tabname)));

    }

// to select the subcategory of the product

    @Given("^user is on product category page$")
    public void user_is_on_category_page() {
        loginPage.goToLogin();
        loginPage.enterLoginEmailAndPassword(prop.getProperty("username"), prop.getProperty("password"));
        loginPage.clickOnLoginButton();
        commonElementPage.selectCategoryTab();

    }

    @When("^user click on the the subcategory icon$")
    public void user_click_on_the_the_subcategory_icon() {
        womenPage.selectSubCategory();
    }

    @Then("^user should landed on the selected subcategory page$")
    public void user_should_able_to_see_the_products_of_the_selected_category() {
        String subcategoryPageTitle = base.getTitle();
        String subcategoryName = womenPage.categoryHeader();
        assertThat(subcategoryPageTitle, is(containsString(subcategoryName)));
    }
//
// User is able to add a product to cart from category and subcategory page

    @When("^user hover over the product$")
    public void user_hover_over_the_product() {
        WebElement selectedProduct = womenPage.setSelectProduct();
        Actions action = new Actions(driver);
        action.moveToElement(selectedProduct).build().perform();
    }

    @And("^user click on the add to basket button$")
    public void user_click_on_the_add_to_basket_button() {
        womenPage.addToCart();


    }

    @Given("^user is on product subcategory page$")
    public void user_is_on_product_subcategory_page() {
        loginPage.goToLogin();
        loginPage.enterLoginEmailAndPassword(prop.getProperty("username"), prop.getProperty("password"));
        loginPage.clickOnLoginButton();
        commonElementPage.selectCategoryTab();
        womenPage.selectSubCategory();

    }

//user is able to see product detail

    @When("^user click on the product$")
    public void user_click_on_the_product() {
        WebElement product = womenPage.setSelectProduct();
        product.click();

    }

    @Then("^user should landed on the product detail info page$")
    public void user_should_landed_on_the_product_detail_info_page() {
        String productName = womenPage.getProductName();
        String pageTitle = base.getTitle();
        assertThat(pageTitle, is(containsString(productName)));


    }

    @When("^click on the more button$")
    public void click_on_the_more_button() {
        womenPage.productInfo();
    }

    @When("^click on the quick view tab$")
    public void click_on_the_quick_view_tab() {
        womenPage.quickViewOfProduct();
    }

    @Then("^user should able to see quick view of the product$")
    public void user_should_able_to_see_quick_view_of_the_product() {
        driver.switchTo().frame(0);
        String productName = womenPage.getProductName();
        System.out.println("product name = " + productName);
        driver.switchTo().defaultContent();
        String pageTitle = base.getTitle();
        System.out.println("page title =  " + pageTitle);
        //assertThat(pageTitle, is(containsString(productName)));
    }

    @Given("^user is on product detail page$")
    public void user_is_on_product_detail_page() {
        loginPage.goToLogin();
        loginPage.enterLoginEmailAndPassword(prop.getProperty("username"), prop.getProperty("password"));
        loginPage.clickOnLoginButton();
        commonElementPage.selectCategoryTab();
        womenPage.selectSubCategory();
        WebElement product = womenPage.setSelectProduct();
        product.click();

    }

    @When("^user select the size$")
    public void user_select_the_size() {
        womenPage.selectSize();

    }

    @And("^user choose the colour$")
    public void user_Choose_the_colour() {
        womenPage.selectColour();

    }

    @And("^user choose the quantity$")
    public void user_choose_the_quantity() {
        womenPage.selectQuantity();

    }

    @When("^click on add to cart button$")
    public void click_on_add_to_cart_button() {

        womenPage.addToCartButton();
    }

    @Then("^product should be added to the cart$")
    public void the_product_should_be_added_to_the_cart() {
        String sucessfullyAddedProductMessage = womenPage.setProductSuccessfullyAdded();
        System.out.println(" product added to basket msg  = " + sucessfullyAddedProductMessage);
        assertThat(sucessfullyAddedProductMessage, is(equalToIgnoringCase("Product successfully added to your shopping cart")));

    }

}
