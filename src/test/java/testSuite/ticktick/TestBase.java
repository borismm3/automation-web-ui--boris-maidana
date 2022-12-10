package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.*;
import session.Session;
import util.GetProperties;

public class TestBase {
    MainPageSection mainPageSection = new MainPageSection();
    DeleteSection deleteSection = new DeleteSection();
    MenuSection menuSection = new MenuSection();
    ProjectScrollerSection projectScrollerSection = new ProjectScrollerSection();
    SignInSection signInSection = new SignInSection();
    TaskDataSection taskDataSection = new TaskDataSection();
    TaskSection taskSection = new TaskSection();
    BarSection barSection = new BarSection();

    String user = GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }
}
