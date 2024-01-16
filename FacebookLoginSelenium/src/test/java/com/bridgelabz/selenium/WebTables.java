package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables {
    public WebDriver driver;

    @Test
    public void webTables() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("table1"));

        List<WebElement> allRows = driver.findElements(By.xpath("//*[@id='table1']//parent::tr"));
        // Count total Table Row..................
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :" + totalRows);
        // Count total table Columns.........
        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);

//        //Count total cells..............................
//        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
//        int totalCells = allCells.size();
//        System.out.println("Total number of cells present in the table is :" + totalCells);

//        List<WebElement> allCells1 = driver.findElements(By.xpath("//table[@id='table1']//thead//th|//tbody//tr"));
//        int totalCells1 = allCells1.size();
//        System.out.println("Total number of cells present in the table is :" + totalCells1);
        //*[@id="table1"]/thead//th|//tbody//tr
Thread.sleep(2000);
        //Count number of cells present in the table
        List<WebElement> allCells = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td | //table[@id='table1']/thead/tr/th"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);

    }
}
