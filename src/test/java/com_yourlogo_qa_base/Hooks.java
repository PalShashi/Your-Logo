package com_yourlogo_qa_base;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks extends Base{

    Base base = new Base();
    Properties prop;
    WebDriver driver;

    public void setUp(){
      prop =  base.property();
      driver = base.browser();
    }

    public void tearDown(){

        driver.close();
    }
}
