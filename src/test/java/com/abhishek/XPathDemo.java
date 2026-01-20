package com.abhishek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();

    // XPath with single attribute
    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tab");

    // XPath with multiple attributes
    driver.findElement(By.xpath("//input[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Mobile");

    // XPath with 'and' operators
    driver.findElement(By.xpath("//input[@id='small-searchterms'and @placeholder='Search store']")).sendKeys("Laptop");

    // XPath with 'or' operators
    driver.findElement(By.xpath("//input[@id='small-searchterms' or @placeholder='xyz']")).sendKeys("Charger");

    // XPath with inner text - text()
    driver.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).click();
    boolean displaystatus = driver.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).isDisplayed();
    System.out.println(displaystatus);
    String value = driver.findElement(By.xpath("//a[text()='Apple MacBook Pro']")).getText();
    System.out.println(value);
    System.out.println(value);

    // XPath with contains()
    driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Keyboard");

    // XPath with starts-with()
    driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Earphone");

    // Chained XPath - //div[@id='logo']/a/img
  }
}
