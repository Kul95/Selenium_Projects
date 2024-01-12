package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLoginSelenium {
    public WebDriver driver;

    @Test
    public void fbLogin() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("Kuldeep@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("kul@123");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#loginbutton")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgotten account?")).click();
        Thread.sleep(2000);
//        driver.findElement(By.linkText("Yes, Continue")).click();
        driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("kuldeepkumar17feb@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("did_submit")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//font[contains(text(),'find out')]")).click();
        Thread.sleep(2000);
    }
}
