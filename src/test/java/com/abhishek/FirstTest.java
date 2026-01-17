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

    /*1) Launch browser (Chrome)
    ChromeDriver driver = new ChromeDriver(); // Create a object to launch chrome
    browser using ChromeDriver();
    OR*/
    WebDriver driver = new ChromeDriver(); // Prefered
    // 2) Open URL https://demo.opencart.com/
    driver.get("https://demo.opencart.com/");

  }
}
