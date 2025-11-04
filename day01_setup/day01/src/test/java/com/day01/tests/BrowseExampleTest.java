package com.day01.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseExampleTest {
    WebDriver driver;

    @Test
    void testExampleDotComIsAccessible() {
        driver = new ChromeDriver();
        System.out.println("Launching Chrome browser...");
        driver.get("https://example.com");

        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        System.out.println("Test Completed.");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
