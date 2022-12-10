package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SignInSection {
    TextBox emailTextBox = new TextBox(By.id("emailOrPhone"));
    TextBox passwordTextBox = new TextBox(By.id("password"));
    Button signInButton = new Button(By.xpath("//button[text()='Sign In']"));

    public void signIn(String email, String password) {
        emailTextBox.setText(email);
        passwordTextBox.setText(password);
        signInButton.click();
    }
}
