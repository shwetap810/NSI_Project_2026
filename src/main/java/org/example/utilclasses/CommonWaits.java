package org.example.utilclasses;

import org.example.testbaseclass.NesWebBasedClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonWaits extends NesWebBasedClass {
    public static WebDriverWait wait;

    public static final long PAGE_LOAD_TIMEOUT = 20;

    public static final long EXPLICIT_WAIT = 20;

    public static void waitUntilElementToBeClickable(WebElement element){
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }



}
