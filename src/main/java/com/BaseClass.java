package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.logging.Logger;

public class BaseClass {
    public static final Logger logger = Logger.getLogger(String.valueOf(BaseClass.class));
    public ThreadLocal<RemoteWebDriver> webdriver = new ThreadLocal<RemoteWebDriver>();

    public void init() {
        webdriver.set(initializeDriver());
    }

    public RemoteWebDriver initializeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        return driver;

    }

    public void loadPage(String url){
        webdriver.get().get(url);
    }

    public void quitDriver(){
        webdriver.get().quit();
    }

    public WebElement findElement(By value){
        return webdriver.get().findElement(value);
    }
}
