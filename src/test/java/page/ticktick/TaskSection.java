package page.ticktick;

import control.Label;
import org.openqa.selenium.By;

public class TaskSection {
    public boolean isTaskDisplayed(String nameTask) {
        Label nameTaskLabel = new Label(By.xpath("//button/p[text()='" + nameTask + "']"));
        return nameTaskLabel.isControlDisplayed();
    }

    public Label getTask(String nameTask) {
        return new Label(By.xpath("//h5[text()='" + nameTask + "']"));
    }
}
