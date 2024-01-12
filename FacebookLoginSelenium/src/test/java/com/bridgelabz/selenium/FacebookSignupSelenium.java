package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookSignupSelenium {
    public WebDriver driver;

    @Test
    public void fbSignupApplication() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("firstname")).sendKeys("Kuldeep");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Sharma");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("kuldeepkumar93203@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kuldeepkumar93203@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("admin@123");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_month")).sendKeys("April");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_year")).sendKeys("2012");
        Thread.sleep(1000);
//        driver.findElement(By.xpath ("//font[contains(text(),'male')]"));
//        Thread.sleep(1000);
        driver.findElement(By.className("_58mt")).click();
        Thread.sleep(2000);
           driver.findElement(By.name("preferred_pronoun")).click();
//        driver.findElement(By.xpath("//button[@id='u_2_s_fX']")).click();

    }
}
