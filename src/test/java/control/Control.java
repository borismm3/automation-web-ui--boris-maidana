package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void find() {
        control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    public void click() {
        this.find();
        control.click();
    }

    public boolean isControlDisplayed() {
        Session.getInstance().getBrowser().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try {
            this.find();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitControlIsNotInThePage() {
        WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
    }
}
