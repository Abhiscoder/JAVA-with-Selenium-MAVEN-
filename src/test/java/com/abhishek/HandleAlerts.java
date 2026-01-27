package com.abhishek;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
  public static void main(String args[]) {
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    // 1) Normal alert with OK button - Alert window for accept() method
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

    Alert myalert = driver.switchTo().alert();

    System.out.println(myalert.getText());
    myalert.accept();

    // 2) Confirmation Alert - OK & Cancel
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

    driver.switchTo().alert().accept(); // close alert using OK button
    driver.switchTo().alert().dismiss(); // close alert using Cancle button

    // 3) Prompt alert - Input box
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

    Alert mypromptAlert = driver.switchTo().alert();

    mypromptAlert.sendKeys("Welcome");
    mypromptAlert.accept();

  }

}
