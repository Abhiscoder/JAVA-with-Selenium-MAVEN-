package com.abhishek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Test Case
    --------
1) Launch browser (Chrome)
2) Open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4) Close browser
*/

public class FirstTest {

  public static void main(String args[]) {

    /*
     * 1) Launch browser (Chrome)
     * ChromeDriver driver = new ChromeDriver(); // Create a object to launch chrome
     * browser using ChromeDriver();
     * OR
     */
    WebDriver driver = new ChromeDriver(); // Prefered
    // 2) Open URL https://www.flipkart.com/
    driver.get("https://www.flipkart.com/"); // object name (driver).get("<URL Link>") is use to open url.
    // 3) Validate title should be "Your Store"
    String actual_title = driver.getTitle();
    System.out.println("test" + actual_title);
    if (actual_title.equals("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failed");
    }
    // 4) Close browser
    // 1 method
    // driver.close();
    // 2. method
    driver.quit();
  }
}
