package com.abhishek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://testautomationpractice.blogspot.com/?m=1");
    WebElement dropCountryEle = driver.findElement(By.xpath("//select[@id='country']"));

    Select dropCountry = new Select(dropCountryEle);

    // Select option from the drop down
    // 1) selectByVisibleText();
    dropCountry.selectByVisibleText("France");// France

    // 2) selectByValue();
    // dropCountry.selectByValue("uk");//United Kingdom

    // 3)selectByIndex();
    // dropCountry.selectByIndex(3);// Germany

    // Capture the options from the dropdown
    List<WebElement> options = dropCountry.getOptions();
    System.out.println("Totel number of options in dropdown:" + options.size()); // 10

    // Printing the options
    // for (int i = 0; i < options.size(); i++) {
    // System.out.println(options.get(i).getText());
    // }

    // Printing the options using Enhance loop
    for (WebElement option : options) {
      System.out.println(option.getText());

    }
  }
}
