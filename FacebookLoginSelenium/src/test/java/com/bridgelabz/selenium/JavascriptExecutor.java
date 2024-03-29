package com.bridgelabz.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutor {
    public WebDriver driver;

    @Test
    public void simple_alert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
    }

    @Test
    public void simpleAlert2() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(8000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(6000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
    }

    @Test
    public void simple_alert3() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Thread.sleep(2000);
        org.openqa.selenium.JavascriptExecutor executor = (org.openqa.selenium.JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,50)");
        Thread.sleep(3000);
        driver.findElement(By.id("confirmButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
    }

    @Test
    public void simpleAlert4() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
    }
}
