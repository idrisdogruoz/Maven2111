package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
//        TC#3: Google search
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com
        driver.get("https://www.google.com");

//        3- Write “apple” in search box
        // 4- Click google search button

        WebElement googleSearchBox = driver.findElement(By.name("q"));  // tıklama  işlemi click değil farklı

        googleSearchBox.sendKeys("apple" + Keys.ENTER);  // sendKeys +  Keys.ENTER **** ÖNEMLİ


//        5- Verify title:
//        Expected: Title should start with “apple” word
        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();
        if (actualInTitle.startsWith(expectedInTitle)) {    // burda Startswith kullandık ***
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title verification FAILED !");
        }

    }
}
