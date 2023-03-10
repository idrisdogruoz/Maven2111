package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {

//        TC #2: Back and forth navigation
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();  // Webdriver olarak  chrome tanımladı
        WebDriver driver = new ChromeDriver();   // yeni chrome sayfası açtı
        driver.manage().window().maximize(); // tam ekran yaptı

//        2- Go to: https://practice.cydeo.com
        // driver.navigate().to("https://practice.cydeo.com");


        driver.get("https://practice.cydeo.com");

//        3- Click to A/B Testing from top of the list.
        //  Thread.sleep(2000);
        //  driver.findElement(By.linkText("A/B Testing")).click();// SAYFAYA TIKLAMA  İŞLEMİ *** 2 farklı yol var ..

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing")); // *** By.linkText Kullandık
        abTestLink.click();


//        4- Verify title is:
//        Expected: No A/B Test
        String expectedTitle = "No A/B Test";  // Title  kıyaslaması yapılırken
        String actualTitle = driver.getTitle();  // actual title GET ile elde  edilir

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title  verification PASS");
        } else {
            System.out.println("Title verification FAILED !");
        }

//        5- Go back to home page by using the .back();
        driver.navigate().back();


//        6- Verify title equals:
//        Expected: Practice

        String expectedTitle2 = "Practice";
        actualTitle = driver.getTitle();  // burda yeni  variable yapmadık

        if(actualTitle.equals(expectedTitle2)){
            System.out.println("Title  verification PASS");
        } else {
            System.out.println("Title verification FAILED !");
        }

    }
}
