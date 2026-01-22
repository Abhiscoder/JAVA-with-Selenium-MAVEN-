package com.abhishek;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    // get()
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(5000);

    // getTitle()
    System.out.println("Title:" + driver.getTitle());

    // getCurrentUrl()
    System.out.println("CurrentURL:" + driver.getCurrentUrl());

    // getPageSoure()
    System.out.println(driver.getPageSource());

    // getWindowHandle()
    String windowid = driver.getWindowHandle();
    System.out.println("Window ID: " + windowid); // F0D4A78C0D57A2109F2FA1969AECE2AC

    // getWindowHandles()
    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
    Set<String> windowids = driver.getWindowHandles();
    System.out.println("Set Window IDs: " + windowids); // [F0D4A78C0D57A2109F2FA1969AECE2AC,
                                                        // 59FEF3BEE5ED24833C6CA4A649A7CA38]

  }
}
