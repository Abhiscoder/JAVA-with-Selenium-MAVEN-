package com.abhishek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); // declaration

    driver.manage().window().maximize();

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    WebElement txtusername = mywait
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

    txtusername.sendKeys("Admin");
    WebElement txtpassword = mywait
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

    txtpassword.sendKeys("admin123");

    WebElement btnlogin = mywait
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));

    btnlogin.click();
    // driver.quit();
  }
}
