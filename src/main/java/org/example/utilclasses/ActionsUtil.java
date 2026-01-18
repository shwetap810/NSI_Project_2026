package org.example.utilclasses;


import org.example.testbaseclass.NesWebBasedClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.example.testbaseclass.NesWebBasedClass.driver;

public class ActionsUtil extends NesWebBasedClass {
    public static Actions actions;

    public static void moveToTheElement(WebElement element){
        actions = new Actions(driver);
        actions.moveToElement(element)
                .perform();
    }

    public static void dragAndDropToTheElement(WebElement srcElement,WebElement descElement){
        actions = new Actions(driver);
        actions.dragAndDrop(srcElement,descElement)
                .perform();

    }
}
