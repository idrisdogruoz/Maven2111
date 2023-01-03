package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {{

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2- Create  instance  of the Selenium WebDriver
        // This  is the line OPENING  an empty browser
        WebDriver driver = new ChromeDriver();

        //This line will MAXIMIZE the browser size
        driver.manage().window().maximize();  // for  both mac  and  windows

        //driver.manage().window().fullscreen(); //- this one sometimes does not work for windows, so better not use it.

        //3- Get "https://www.tesla.com"
        driver.get("https://www.tesla.com"); // https silersek ne olur .. ==> çalışmaz


        //Stop code  execution for 3 seconds
         Thread.sleep(3000);

        // use selenium to  navigate  back // girip geri çıkıyor
        driver.navigate().back();


        //Stop code  execution for 3 seconds
         Thread.sleep(3000);

        // use selenium to  navigate  back // girip geri çıkıyor
        driver.navigate().forward();

        // use  selenium to navgate refresh
        driver.navigate().refresh();

        // use  navigate().to():
        driver.navigate().to("https://www.google.com");

        // get  the title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        String  currentTitle =  driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // getCurrentUrl
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //this will close  the currently opened window
        driver.close();

        // will close  all opened windows
        driver.quit();


    }
}}
