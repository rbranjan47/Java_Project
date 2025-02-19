package Methods;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.base_class;

public class reusable_methodsClass extends base_class {
    public static WebElement element;

    public reusable_methodsClass(WebDriver driver) {
        base_class.driver = driver;
    }

    // javascript click
    public static void jsclick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

    }

    // WebDriver wait
    public void webdriverwait(WebDriver driver, WebElement element1) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element1));
    }

    //date to pass the date
    public String date(int year, int month, int day) {

        Date date = new Date(year, month, day);
        SimpleDateFormat date_formatter = new SimpleDateFormat("dd-MM-yyyy");
        String date_in_format = date_formatter.format(date);
        return date_in_format;
    }

    //mouse hover on the element
    public void mouse_hover(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }

    //javascript refresh method
    public void refresh_page(WebDriver driver) {
        JavascriptExecutor execute = (JavascriptExecutor) driver;
        execute.executeScript("history.go(0)");

    }
}
