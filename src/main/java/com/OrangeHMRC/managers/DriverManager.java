package com.OrangeHMRC.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static String webDriverType = "Chrome";
    private static DriverManager instance;
    private WebDriver driver;

    private DriverManager(){
        switch ( webDriverType.toUpperCase()) {
            case "CHROME":
                driver = new ChromeDriver();
                System.out.println("The Chrome Driver was initiated");
                break;
        }
    }

    public static DriverManager getInstance(){
        if (instance == null){
            instance = new DriverManager();
        }
        return instance;
    }

    public WebDriver getDriver(){
        if( driver == null){
            getInstance();
        }
        return driver;
    }
}
