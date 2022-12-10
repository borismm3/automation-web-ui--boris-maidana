package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class MainPageSection {
    public Button signInButton = new Button(By.xpath("//div[contains(@class,'navRow')]//a[text()='Sign In']"));
}
