package com_yourlogo_qa_base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public  WebDriver driver;

    Properties prop;

//    public Base()
//    {
//        PageFactory.initElements(driver ,this);
//    }

    public Properties property() {
        prop = new Properties();

        try {
            FileInputStream fis = new FileInputStream("G:\\com_yourlogo_pageobjectmodel_withcucumber\\src\\test\\java\\com_yourlogo_qa_config\\config.properties");
            prop.load(fis);

        } catch (FileNotFoundException e) {
            System.out.println("Please check:  Either file path is not correct or file is missing");
        } catch (IOException e) {
            System.out.println("Please check: Property object is not able to read the file ");
        }
        return prop;
    }

    public WebDriver browser() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (browserName.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Please check driver has not been initialized or check the property of config file");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("wait")), TimeUnit.SECONDS);
        return driver;
    }
public String getTitle(){
        return driver.getTitle();
}

}

