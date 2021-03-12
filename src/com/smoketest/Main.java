package com.smoketest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        // Set driver to Chrome

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yhoar\\OneDrive\\Desktop\\SeleniumDownloads\\Drivers\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();


// Launch Cypress
        obj.get("https://www.commissionpaymentservices.com/login.aspx?id=ctl");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Welcome"))
        {
            System.out.println("Cypress ----> PASSED");
        }
        else
        {
            System.out.println("Cypress ----> FAILED");
        }
// Launch FL Hwy Patrol
        obj.get("https://www.fhpcvepayments.com/login.aspx");
        Thread.sleep(3000);

        if(obj.getPageSource().contains("Please enter a citation"))
        {
            System.out.println("FL Hwy Patrol ----> PASSED");
        }
        else
        {
            System.out.println("FL Hwy Patrol ----> FAILED");
        }
// Launch FL Hwy Safety
        obj.get("https://admin.fhpcvepayments.com/");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Please enter your ID and password"))
        {
            System.out.println("FL Hwy Safety ----> PASSED");
        }
        else
        {
            System.out.println("FL Hwy Safety ----> FAILED");
        }
// Launch Meridian S Jersey Gas
        obj.get("http://meridian-bill2pay.southjerseygas.com");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Meridian Payment Landing Site"))
        {
            System.out.println("Meridian S Jersey Gas ----> PASSED");
        }
        else
        {
            System.out.println("Meridian S Jersey Gas ----> FAILED");
        }
// Launch Meridian Etown Gas
        obj.get("https://meridian-bill2pay.elizabethtowngas.com/");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Meridian Payment Landing Site"))
        {
            System.out.println("Meridian Etown Gas ----> PASSED");
        }
        else
        {
            System.out.println("Meridian Etown Gas ----> FAILED");
        }
// Launch Bill2Pay
        obj.get("https://pay.bill2pay.com/");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Missing or Invalid Client Information"))
        {
            System.out.println("Bill2Pay ----> PASSED");
        }
        else
        {
            System.out.println("Bill2Pay ----> FAILED");
        }
// Launch PeachCare for Kids
        obj.get("https://peachcaremypayments.bill2pay.com/login/");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Don't have a profile?"))
        {
            System.out.println("PeachCare for Kids ----> PASSED");
        }
        else
        {
            System.out.println("PeachCare for Kids ----> FAILED");
        }
// Launch PeachCare Express
        obj.get("https://peachcare.bill2pay.com/");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Case Number"))
        {
            System.out.println("PeachCare Express ----> PASSED");
        }
        else
        {
            System.out.println("PeachCare Express ----> FAILED");
        }
// Launch B2P API
        obj.get("https://api2.bill2pay.com/b2pclassicapi.ashx");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("ACTIVE"))
        {
            System.out.println("B2P API ----> PASSED");
        }
        else
        {
            System.out.println("B2P API ----> FAILED");
        }
// Launch B2P web services
        obj.get("https://webservices.bill2pay.com/sso/gateway.ashx");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("ACTIVE"))
        {
            System.out.println("B2P web services ----> PASSED");
        }
        else
        {
            System.out.println("B2P web services ----> FAILED");
        }
// Launch B2P Auto agent
        obj.get("https://autoagent.bill2pay.com/pay/");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Credit/Debit Card Number"))
        {
            System.out.println("B2P Auto agent ----> PASSED");
        }
        else
        {
            System.out.println("B2P Auto agent ----> FAILED");
        }
// Launch B2P Collector
        obj.get("https://collectorfl.bill2pay.com/default.aspx?token=b2e4c6c88441464390e70faec3e3e892");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Payment Options"))
        {
            System.out.println("B2P Collector ----> PASSED");
        }
        else
        {
            System.out.println("B2P Collector ----> FAILED");
        }
// Launch B2P Client portal
        obj.get("https://clientportal.bill2pay.com/login/login.aspx");
        Thread.sleep(3000);
        if(obj.getPageSource().contains("Secure Login Page"))
        {
            System.out.println("B2P Client portal ----> PASSED");
        }
        else
        {
            System.out.println("B2P Client portal ----> FAILED");
        }


        obj.quit();
    }
}
