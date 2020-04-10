package com_yourlogo_qa_pages;

import com_yourlogo_qa_base.Base;
import com_yourlogo_qa_utils.GenericMethod;
import com_yourlogo_qa_utils.RandomHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WomenPage extends Base {
    public WebDriver driver;
    RandomHelper random = new RandomHelper();
    GenericMethod genericMethodmethod = new GenericMethod(driver);
    public int randomIndex;

    //    @FindBy(css="div>a[title='Dresses']")
//    WebElement  subcategoryLink   ;

    @FindBy(css = "div#subcategories>ul>li")
    List<WebElement> subcategoryIcon;

    @FindBy(css = "select.selectProductSort")
    WebElement sortBy;

    @FindBy(css = "div.block_content>ul.tree.dynamized>li")
    List<WebElement> dressesSubcategoryFilter;

    @FindBy(css = "ul#ul_layered_category_0>li>div>span")
    List<WebElement> catalogCategories;

    @FindBy(css = "h5[itemprop ='name']>a.product-name")
    List<WebElement> selectProduct;

    @FindBy(css = "a[title = 'Add to cart']")
    List<WebElement> addToCartlinks;

    @FindBy(xpath = "// h1[@itemprop = 'name']")
    WebElement productName;

    @FindBy(css = " a.button.lnk_view.btn.btn-default")
    WebElement moreLink;

    @FindBy(css = "a.quick-view")
    WebElement quickViewlink;

    @FindBy(css = "input#quantity_wanted")
    WebElement quantity;

    @FindBy(css = "#group_1.form-control.attribute_select.no-print")
    WebElement size;

    @FindBy(css = "select>option")
    List<WebElement> sizeOption;

    @FindBy(css = "ul#color_to_pick_list>li")
    List<WebElement> chooseColour;

    @FindBy(xpath = "//span[text() = 'Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@ id ='layer_cart']/div/div/h2")
    WebElement productSuccessfullyAdded;

    @FindBy(css = "span.category-name")
    WebElement categoryHeader;

    public WomenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String

    selectSubCategory() {

        List<WebElement> subCategories = subcategoryIcon;

        int subCatergorySize = subCategories.size();

        if (subCatergorySize == 0) {
            System.out.println("I donot have category for you because there is no subcategory defined to it ");
        }
        int randomSubcategoryIndex = random.generateRandomNumber(subCatergorySize);

        WebElement subCategory = subCategories.get(randomSubcategoryIndex);

        String selectedSubcategory = subCategory.getText();
        System.out.println(" Selected subcategory name is  = " + selectedSubcategory);

        subCategory.click();

        return selectedSubcategory;
    }


    public WebElement setSelectProduct() {
        List<WebElement> products = selectProduct;
        int productSize = products.size();

        if (productSize == 0) {
            System.out.println("I donot have a product for you ");

        }
        randomIndex = random.generateRandomNumber(productSize);

        WebElement product = products.get(randomIndex);

        String selectedProduct = product.getText();
        System.out.println("selected Product is = " + selectedProduct);
        return product;
    }

    @FindBy(css = "a.button.ajax_add_to_cart_button.btn.btn-default>span")
    WebElement link;

    public WebElement addToCart() {

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click()", link);

        List<WebElement> addToCartLinks = addToCartlinks;
        int addToCartLinksSize = addToCartLinks.size();
        if (addToCartLinksSize == 0) {
            System.out.println("I dodnot have a add to cart link for you");
        }
        WebElement addToCartLink = addToCartLinks.get(randomIndex);
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("arguments[0].click", addToCartLink);

        return addToCartLink;


    }

    public String categoryHeader() {
        String categoryName = categoryHeader.getText();
        return categoryName;
    }

    public String getProductName() {

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfAllElements(productName));
        String text = productName.getText();
        return text;
    }

    public void productInfo() {
        moreLink.click();
    }

    public void quickViewOfProduct() {
        quickViewlink.click();
    }

    public void selectQuantity() {
        quantity.clear();
        int randomGeneratedQuantity = random.generateRandomNumber(10);
        String randomQuantity = String.valueOf(randomGeneratedQuantity);
        quantity.sendKeys(randomQuantity);
    }

    public int sizeOptions() {
        List<WebElement> productSizes = sizeOption;
        int size = productSizes.size();
        return size;

    }

    public void selectSize() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(size));

        Select select = new Select(size);
        int size = sizeOptions();
        int randomProductSize = random.generateRandomNumber(size);
        select.selectByIndex(randomProductSize);
    }

    public void selectColour() {
        List<WebElement> chooseColours = chooseColour;
        int colouroptions = chooseColours.size();
        int randomIndex = random.generateRandomNumber(colouroptions);
        String selectedColour = chooseColours.get(randomIndex).getText();
        System.out.println("Selected colour is  = " + selectedColour);
        chooseColours.get(randomIndex).click();

    }

    public void addToCartButton() {

        addToCartButton.click();
    }

    public String setProductSuccessfullyAdded() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(productSuccessfullyAdded));

        String addedProductConfirmation = productSuccessfullyAdded.getText();
        return addedProductConfirmation;
    }

}


