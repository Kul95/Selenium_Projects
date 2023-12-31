package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Mouse_KeyBoard_Operations {
    public WebDriver driver;

    @Test
    public void mouse_Keyboard() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Robot robot = new Robot();
//        Robot robot = new Robot();
        Thread.sleep(3000);
        //mouseMove............
        robot.mouseMove(600, 600);
        //mouseWheel............
        robot.mouseWheel(5);
        //keyPress and keyRelease..............
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        Thread.sleep(1000);
        //Select.............
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(1000);
        //Copy.............
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(1000);
        //Paste.......
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
    }
@Test
    public void scrollUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,50)");
    }
@Test
    public void desable_enable_Input() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Admin/Desktop/Selenium/index1.html");
        driver.manage().window().maximize();
//Enable.....
        driver.findElement(By.id("1")).sendKeys("Sharma");
        Thread.sleep(2000);
//Disable.............
        driver.findElement(By.id("2")).sendKeys("Sharma");
        Thread.sleep(2000);
    }
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
