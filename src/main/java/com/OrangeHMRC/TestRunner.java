package com.OrangeHMRC;

import com.OrangeHMRC.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        // Define a driver object that will be used for future actions.
       WebDriver driver = DriverManager.getInstance().getDriver();

       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(5000);

       String currentWindowName = driver.getWindowHandle();

       driver.switchTo().newWindow(WindowType.TAB);

       driver.get("https://mvnrepository.com/search?q=selenium+Chrome");

       driver.close();

       driver.switchTo().window(currentWindowName);
        Thread.sleep(1000);

       driver.get("https://999.md/ro/");

       driver.quit();

    }
}