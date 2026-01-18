package org.example.utilclasses;


import org.example.testbaseclass.NesWebBasedClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class ScrollDownUtil extends NesWebBasedClass {

    public static JavascriptExecutor javascriptExecutor;

    public static void scrollDownPage(WebElement element) {
        javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments [0].scrollIntoView()", element);
    }
}
