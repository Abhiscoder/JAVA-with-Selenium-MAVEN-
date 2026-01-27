package com.abhishek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");

    // 1) Select specific checkbox
    driver.findElement(By.xpath("//input[@id='sunday']")).click();

    // 2) All checkbox check
    List<WebElement> checkboxes = driver
        .findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

    for (int i = 0; i < checkboxes.size(); i++) {
      checkboxes.get(i).click();
    }

    for (WebElement ch : checkboxes) {
      ch.click();
    }

    // 3) Seclect Last 3 checkboxes
    // total no of checkboxes - how many checkboxes want to select = starting index
    // 7-3 =4 (stating index)
    for (int i = 4; i < checkboxes.size(); i++) {
      checkboxes.get(i).click();
    }

    // 4) Select first 3 checkboxes
    for (int i = 0; i < 3; i++) {
      checkboxes.get(i).click();
    }

    // 5) Unselect checkboxes if they are selected
    for (int i = 0; i < 3; i++) {
      checkboxes.get(i).click();
    }

    // Thread.sleep(5000);

    for (int i = 0; i < checkboxes.size(); i++) {
      if (checkboxes.get(i).isSelected()) {
        checkboxes.get(i).click();
      }
    }

  }

}
