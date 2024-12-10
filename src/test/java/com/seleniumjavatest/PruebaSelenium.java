package com.seleniumjavatest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PruebaSelenium {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        driver.get("https://mvnrepository.com/");
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}