package com_yourlogo_qa_utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class GenericMethod {
    WebDriver driver;

    public GenericMethod(WebDriver driver) {

        this.driver = driver;
    }

    public void implicitWaitElementVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

    }


    public WebElement implicitWaitElementPresence(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }

    public void javascriptExecutorClick(WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", element);
    }

    public void javascriptExecutorSendText(WebElement element, String text) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].value = ' " + text + " ' ;", element);
    }


    // explicit wait
    public void waitForElementPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    //****
    public void waitForElementPresent1(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
    }


    // find element mapped with explicit wait
    public WebElement getElement(By locator) {
        waitForElementPresent(locator);

        WebElement element = null;
        try {
            element = driver.findElement(locator);
            //if (flash.equalsIgnoreCase("yes")) {
            //JavaScriptUtil.flash(element, driver);
            //}
        } catch (Exception e) {
            System.out.println("Some exception occurred while creating webelement " + locator);
        }
        return element;
    }


    // click method bind with get method
    public void doClick(By locator) {
        try {
            getElement(locator).click();
        } catch (Exception e) {
            System.out.println("Some exception occurred while clicking on webelement " + locator);
        }
    }

    // send keys method , first it clear, then it bind with get()
    public void doSendKeys(By locator, String value) {
        try {
            getElement(locator).clear();
            getElement(locator).sendKeys(value);
        } catch (Exception e) {
            System.out.println("Some exception occurred while sending to webelement " + locator);
        }

    }

    // get text + get()
    public String doGetText(By locator) {
        String text = null;
        try {
            text = getElement(locator).getText();
        } catch (Exception e) {
            System.out.println("Some exception occurred while sending to webelement " + locator);
        }
        return text;
    }

    // page title
    public String waitForPageTitle(String title) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleContains(title));
        return driver.getTitle();
    }

    // element displayed  + get()
    public boolean isElementDisplayed(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (Exception e) {
            System.out.println("Some exception occurred while checking webelement displayed " + locator);
            return false;
        }
    }

    public boolean isElementSelected(By locator) {
        try {
            return getElement(locator).isSelected();
        } catch (Exception e) {
            System.out.println("Some exception occured while checking webelement is selected  " + locator);
            return false;
        }

    }

    public String getUrl() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = driver.getCurrentUrl();
        return url;
    }

    public void waitImplicit() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void iFrame() {
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));

        System.out.println(frames.size());

        for (WebElement frame : frames) {

            System.out.println(frame.getAttribute("id"));
        }
    }

    public  void captureScreenshot()  {

        Date d = new Date();
        String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(".\\screenshot\\"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementPresent(By by) {

        try {
            driver.findElement(by);
            return true;
        }catch(Throwable t) {
            //t.printStackTrace();
            return false;

        }
    }
}

