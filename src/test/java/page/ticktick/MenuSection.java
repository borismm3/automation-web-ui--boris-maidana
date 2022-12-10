package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button editButton = new Button(By.xpath("//a[text()='Edit']"));
    public Button deleteButton = new Button(By.xpath("//a[text()='Delete']"));
}
