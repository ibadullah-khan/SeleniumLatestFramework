package com.ibad.driver;

import com.ibad.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class Driver {
    public static WebDriver driver;

    public static void initDriver(){
        if (Objects.isNull(driver))
        {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.get("https://www.google.com");
        }


    }

    public static void quitDriver(){
        if (!Objects.isNull(driver))
        {
            driver.quit();
            driver = null;
        }
    }
}
