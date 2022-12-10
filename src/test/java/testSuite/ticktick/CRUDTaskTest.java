package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTaskTest extends TestBase {
    @Test
    public void verifyCRUDTask() {
        String taskCreated = "MOJIX" + new Date().getTime();
        String taskUpdated = "UPDATED" + new Date().getTime();

        // Sign in
        mainPageSection.signInButton.click();
        signInSection.signIn(user, password);
        Assertions.assertTrue(barSection.isUserDisplayed(), "The sign in has failed");

        // Create a task
        projectScrollerSection.addNewTask.click();
        taskDataSection.nameOfTask.setText(taskCreated);
        taskDataSection.saveButton.click();
        Assertions.assertTrue(taskSection.isTaskDisplayed(taskCreated), "The task has not been created");

        // Update the task
        projectScrollerSection.taskButton(taskCreated).waitControlIsNotInThePage();
        projectScrollerSection.taskButton(taskCreated).click();
        projectScrollerSection.menuOfCurrentTask.click();
        menuSection.editButton.click();
        taskDataSection.nameOfTask.cleanSetText(taskUpdated);
        taskDataSection.saveButton.click();
        taskSection.getTask(taskUpdated).waitControlIsNotInThePage();
        Assertions.assertTrue(taskSection.isTaskDisplayed(taskUpdated), "The task has not been updated");

        // Delete the task
        projectScrollerSection.menuOfCurrentTask.click();
        menuSection.deleteButton.click();
        deleteSection.confirmDeleteButton.click();
        Assertions.assertFalse(taskSection.isTaskDisplayed(taskUpdated), "The task has not been removed");
    }
}
