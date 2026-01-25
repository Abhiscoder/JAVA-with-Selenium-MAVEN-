package com.abhishek;

import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();

    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

    Set<String> windowIDs = driver.getWindowHandles();

    //Apporach 1
    List<String> windowList  = new ArrayList(windowIDs);

    String parentID = windowList.get(0);
    String childID = windowList.get(1);

    System.out.println(driver.getTitle());
    

  }
}
