package tests;

import org.testng.annotations.Test;

public class JavaFXTest extends TestBase {

    @Test
    public void launch() {
        // Robot robot = Application.GetApplication().createRobot();
        // robot;
        // JavafxRobotAdapter adapter = new JavafxRobotAdapter();
        clickOn("#Start");
        sleep(2000);
    }
}
