package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Screensort_Selenium {
    public WebDriver driver;

    @Test
    public void screenSort() throws InterruptedException, AWTException, IOException {
        driver = new ChromeDriver();
//        driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File file1 = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file2 = new File("C:\\Users\\Admin\\Desktop\\SeleniumProjects\\screesort\\fb_Login.jpg");
        FileHandler.copy(file1, file2);
    }
}
