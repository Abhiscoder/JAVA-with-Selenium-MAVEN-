package com.abhishek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();

    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize(); // Maximize the browser windows

    // ID
    driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mobiles");

    // Class
    driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Tablet");

    // Attribute
    driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Laptop");

    // class + Attribute
    driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Earphone");
  }
}
