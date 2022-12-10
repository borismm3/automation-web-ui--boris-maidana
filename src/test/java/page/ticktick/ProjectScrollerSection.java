package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class ProjectScrollerSection {
    public Button addNewTask = new Button(By.xpath("//section[1]//button[contains(@class,'add-icon')]"));
    public Button menuOfCurrentTask = new Button(By.xpath("//button[contains(@class,'bg-primary-10')]//div[contains(@class,'peer')]"));

    public Button taskButton(String nameTask) {
        Button taskButton = new Button(By.xpath("//button/p[text()='" + nameTask + "']"));
        taskButton.waitControlIsNotInThePage();
        return taskButton;
    }
}
