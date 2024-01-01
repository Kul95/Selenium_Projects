package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
    public WebDriver driver;
    @Test
    public void using_Drag_and_drop() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement des=driver.findElement(By.id("draggable"));
        WebElement element2=driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions action =  new Actions(driver);
        action.dragAndDrop(des,element2).perform();
    }
}
