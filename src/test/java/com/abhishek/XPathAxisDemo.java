package com.abhishek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxisDemo {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
    driver.manage().window().maximize();

    // Self - Selects the current node
    String text = driver.findElement(By.xpath("//a[contains(text(),'Mangalore Refine')]/self::a")).getText();
    System.out.println("Self :" + text);

    // Parent - Select the parent of the current node (always one)
    text = driver.findElement(By.xpath("//a[contains(text(),'Mangalore Refine')]/parent::td")).getText();
    System.out.println("Parent :" + text);

    // // Child - Selects all children of the current node (One or many)
    // List<WebElement> childs =
    // driver.findElements((By.xpath("//a[contains(text(),'Mangalore
    // Refine')]/ancestor::tr")));
    // System.out.println("Number of child elements:" + childs.size());

    // ancestor - Select all ancestors (Parent, grandparent, etc.)
    text = driver.findElement(By.xpath("//a[contains(text(),'Mangalore Refine')]/ancestor::tr")).getText();
    System.out.println("Ancestor:" + text);

    // descendant - selects all descendants (childeren, grandchildren, etc.) of the
    // current node
    List<WebElement> descendants = driver
        .findElements(By.xpath("//a[contains(text(),'Mangalore Refine')]/ancestor::tr/descendant::*"));
    System.out.println("Number of Descendants nodes:" + descendants.size());

    // Following Nodes
    List<WebElement> followingnodes = driver
        .findElements(By.xpath("//a[contains(text(),'Mangalore Refine')]/ancestor::tr/following::tr"));
    System.out.println("Number of followingnodes:" + followingnodes.size());

    // followingsibling
    List<WebElement> followingsibling = driver
        .findElements(By.xpath("//a[contains(text(),'Mangalore Refine')]/ancestor::tr/following-sibling::tr"));
    System.out.println("Number of followingsibling:" + followingsibling.size());

    // preceding sibling
    // List<WebElement> precedingssibling = driver
    // .findElements(By.xpath("//a[contains(text(),'Mangalore
    // Refine')]/ancestor::tr/preceding-sibiling::tr"));
    // System.out.println("Number of precedingssibling:" +
    // precedingssibling.size());

  }
}
