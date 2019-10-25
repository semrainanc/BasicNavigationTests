package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class TitleVerification {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(1000);
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        Thread.sleep(1000);

        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(1000);
        String title1 = driver.getTitle();
        String url1 = driver.getCurrentUrl();
        Thread.sleep(1000);

        driver.get("http://practice.cybertekschool.com/login");
        Thread.sleep(1000);
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();
        Thread.sleep(1000);

        if(title.equals(title1)&&title.equals(title2)){
            System.out.println("Titles are same");
        }else{
            System.out.println("Titles are NOT same");
        }

        if(url.startsWith("http://practice.cybertekschool.com")&&
                url1.startsWith("http://practice.cybertekschool.com")&&
                url2.startsWith("http://practice.cybertekschool.com")){
            System.out.println("Urls are start with http://practice.cybertekschool.com");
        }else{
            System.out.println("Urls are NOT start with http://practice.cybertekschool.com");
        }
        Thread.sleep(1000);
        driver.quit();
}
}
