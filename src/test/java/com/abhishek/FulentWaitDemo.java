package com.abhishek;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FulentWaitDemo {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    // Fluent wait declaration
    Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);

    driver.manage().window().maximize();

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
      public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@placeholder='Username']"));
      }
    });

    txtUsername.sendKeys("Admin");

    // WebElement txtpassword = mywait
    // .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

    // txtpassword.sendKeys("admin123");

    // WebElement btnlogin = mywait
    // .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));

    // btnlogin.click();
    // driver.quit();
  }
}
