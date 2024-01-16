package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionClass1 {
    public WebDriver driver;
    @Test
    public void actionClass() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Admin/Desktop/Selenium/demo2.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
//        driver.findElement(By.id("t1")).sendKeys("Santosh");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("t2")).sendKeys("Sharma");
    }
}
