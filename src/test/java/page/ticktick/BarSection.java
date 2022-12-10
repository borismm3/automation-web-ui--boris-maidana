package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class BarSection {
    public boolean isUserDisplayed() {
        Button userButton = new Button(By.id("tl-bar-user"));
        return userButton.isControlDisplayed();
    }
}
