package com_yourlogo_qa_utils;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class RandomHelper {
    WebDriver driver;

    public static int generateRandomNumber(int size) {
        int random;
        if (size == 1) {
            random = new Random().nextInt(size);
        } else {
            random = new Random().nextInt(size - 1);
        }
        return random;

    }

    public static String generateRandomString(int size) {

        return RandomStringUtils.randomAlphanumeric(size);
    }

    public static void takeScreenShot(WebDriver driver, String fileName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("./target/screenshot/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void captureScreenshot(WebDriver driver)  {

        Date d = new Date();
        String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(".\\screenshot\\"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


