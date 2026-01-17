package com.abhishek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    driver.get("https://demo.nopcommerce.com/");
    // maximize window
    driver.manage().window().maximize();

    // name
    driver.findElement(By.name("q")).sendKeys("Mobile");

    // id
    boolean logoDisplayStatus = driver.findElement(By.id("small-searchterms")).isDisplayed();
    System.out.println(logoDisplayStatus);

    // linktext
    driver.findElement(By.linkText("Build your own computer")).click();

    // partialLinkText
    driver.findElement(By.partialLinkText("Apple")).click();

    // now check new website
    /*
     * driver.get("https://demo.opencart.com");
     * // class
     * List<WebElement> headerLinks =
     * driver.findElements(By.className("list-inline-item"));
     * System.out.println("Total number of header links:" + headerLinks.size());
     */

    // tagname

    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("Total number of links:" + links.size());

    List<WebElement> images = driver.findElements(By.tagName("img"));
    System.out.println("Total Number of Images: " + images.size());

    driver.close();
  }
}
