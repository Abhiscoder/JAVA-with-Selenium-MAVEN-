package com.abhishek;

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
    dropCountry.selectByVisibleText("France");//France

    // 2) selectByValue();
    dropCountry.selectByValue("uk");//United Kingdom

    // 3)selectByIndex();
    dropCountry.selectByIndex(3);// Germany

  }
}
