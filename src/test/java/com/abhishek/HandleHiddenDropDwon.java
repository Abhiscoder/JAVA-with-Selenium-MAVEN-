package com.abhishek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDwon {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();

    // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");

    // Login steps
    // driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

    // Clicking on PIM  and performe action
    driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

    // to be continue ... but I can't understand right now...

  }
}
