package com.abhishek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefrems {
  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();

    driver.get("https://ui.vision/demo/webtest/frames/");
    // Frame1 using WebElement
    WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
    driver.switchTo().frame(frame1);
    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
    driver.switchTo().defaultContent();// go back to main page

    // Frame2
    WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    driver.switchTo().frame(frame2);
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Thankyou");
    driver.switchTo().defaultContent();// go back to main page
    
    //Frame3
    WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    driver.switchTo().frame(frame3);
    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Please Seat down");
    
    //Inner iframe - part of Frame3
    driver.switchTo().frame(0); //Switching to frame using index
    driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
    driver.switchTo().defaultContent();// go back to main page
    
  }
}
