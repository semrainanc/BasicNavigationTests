package com.cbt.tests;

import org.openqa.selenium.WebDriver;
import com.cbt.utilities.BrowserFactory;

public class NavigationTestsChrome{

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = BrowserFactory.getDriver("chrome");
driver.get("http://google.com");
String title = driver.getTitle();
        System.out.println("title = " + title);
Thread.sleep(3000);

driver.get("http://etsy.com");
String title1=driver.getTitle();
        System.out.println("title1 = " + title1);
        Thread.sleep(3000);

        driver.navigate().back();
        String title2 = driver.getTitle();
        if(title.equals(title2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        Thread.sleep(3000);

        driver.navigate().forward();
        String title3 = driver.getTitle();
        if(title1.equals(title3)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        Thread.sleep(3000);
        driver.quit();
    }

}
