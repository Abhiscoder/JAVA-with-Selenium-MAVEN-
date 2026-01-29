package com.abhishek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDorpdown {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

    driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // opens dropdown options

    // 1) Select single option
    driver.findElement(By.xpath("//input[@value='Java')]")).click();

    // 2) Capture all the options and find of the size
    List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
    System.out.println("Number of options:" + options.size()); // 14

    // 3) Printing options from dropdown
    for (WebElement option : options) {
      System.out.println(option.getText());
    }

    // 4)Select Multiple options
    for (WebElement op : options) {
      String option = op.getText();
      if (option.equals("Java") || option.equals("Python") || option.equals("MySQL")) {
        op.click();
      }
    }
  }
}
