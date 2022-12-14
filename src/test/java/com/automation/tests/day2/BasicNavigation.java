package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //In selenium, everything starts from Webdriver interface
        //ChromeDriver extends RemoteWebdriver-->implements Webdriver
        driver.get("http://google.com");//to open a website

        Thread.sleep(3000);//for demo, wait 3 seconds

        driver.close();
    }
}
