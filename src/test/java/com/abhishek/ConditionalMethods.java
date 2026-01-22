package com.abhishek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

  public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/register");
    driver.manage().window().maximize();

    // isDisplayed()
    WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    System.out.println("Display status of logo:" + logo.isDisplayed());

    WebElement RegisterText = driver.findElement(By.xpath("//h1[contains(.,Register)]"));
    System.out.println("Display status of Register Text:" + RegisterText.isDisplayed());

    // isEnabled()
    boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
    System.out.println("Check status of isEnable:" + status);

    // isSelected()
    WebElement newslater = driver.findElement(By.xpath("//input[@id='NewsLetterSubscriptions_0__IsActive']"));
    WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
    WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

    System.out.println("Check status of Checkbox isSelected:" + newslater.isSelected()); // true

    System.out.println("Before selection...");
    System.out.println("Check status of radio btn isSelected:" + male.isSelected()); // false
    System.out.println("Check status of radio btn isSelected:" + female.isSelected()); // false

    System.out.println("After selection...");
    female.click();
    System.out.println("Check status of radio btn isSelected:" + male.isSelected()); // false
    System.out.println("Check status of radio btn isSelected:" + female.isSelected()); // true

    // driver.close();

  }
}
