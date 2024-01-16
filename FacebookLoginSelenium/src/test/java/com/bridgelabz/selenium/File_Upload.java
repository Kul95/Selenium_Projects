package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class File_Upload {
public ChromeDriver driver;
@Test
    public void pdfConvert() throws IOException, InterruptedException, IOException {
        driver=new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-converter");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("\"C:\\Users\\Admin\\Desktop\\AutoitDemo.exe\"");
        Thread.sleep(25000);
        driver.findElement(By.xpath("//div[text()='.docx' or text()='(.docx)']")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//*[@id='app']/div/div[1]/header/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/button/div/span")).click();
        Thread.sleep(17000);
        driver.findElement(By.xpath("//span[text()='Continue' or text()='Convert']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/svg")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button[2]/div/span")).click();
    }
}
