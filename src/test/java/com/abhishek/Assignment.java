package com.abhishek;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment { 

  /*
   * 1.Assignment -Test Case
   * i) Launch browser (chrome and edge)
   * ii) Open URL https://demo.nopcommerce.com/
   * iii) Validate title should be "nopCommerce demo store. Home page title"
   * iv) close Page
   */
  public static void main(String args[]) {
    //Chrome browser
    // WebDriver driver = new ChromeDriver();
    //Edge browser
    WebDriver driver = new EdgeDriver();

    driver.get("https://demo.nopcommerce.com/");

    String actual_Title = driver.getTitle();

    if (actual_Title.equals("nopCommerce demo store. Home page title")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failed");
    }

    driver.close();
  }
}
