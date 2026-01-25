package com.abhishek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();

    // driver.get("https://demo.nopcommerce.com/"); //open page and accepts URL in
    // the string format
    driver.navigate().to("https://demo.nopcommerce.com/"); // open page with history and accepts URL in the string
                                                           // format and object format
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    driver.navigate().back();
    System.out.println(driver.getCurrentUrl());

    driver.navigate().forward();
    System.out.println(driver.getCurrentUrl());

    driver.navigate().refresh();
  }

}
