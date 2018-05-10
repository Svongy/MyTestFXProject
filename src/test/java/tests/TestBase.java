package tests;

import com.test.gui.Main;
import javafx.stage.Stage;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.service.adapter.impl.JavafxRobotAdapter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.ResourceBundle;

public abstract class TestBase extends ApplicationTest{

    protected static ResourceBundle bundle;

    @BeforeTest
    public void setUp() throws Exception {
        // JavafxRobotAdapter adapter = new JavafxRobotAdapter();


        if (Boolean.getBoolean("headless")) {
            System.setProperty("java.awt.headless", "true");
            System.setProperty("testfx.robot", "glass");
            // System.setProperty("testfx.headless", "true");
            System.setProperty("prism.order", "sw");
            System.setProperty("prism.text", "t2k");
        }

      //  bundle = ResourceBundle.getBundle("Bundle");
        ApplicationTest.launch(Main.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
    }

    @AfterTest
    public void afterTest() throws Exception {
        FxToolkit.hideStage();
    }
}
