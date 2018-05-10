/*
import javafx.application.Application;
import javafx.stage.Stage;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.toolkit.ApplicationLauncher;

import java.net.URL;

public class AppRunner extends ApplicationLauncher {

    private String mainClass;
    private URL appFileName;

    public void launch(Class<? extends Application> setMainClass, String... strings) {
        Application.launch(mainClass, setAppFileName);
    }

    private Class getJar() {
        try {
            return BuildLoader.getMainJar(mainClass, appFileName);
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }

    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public void setAppFileName(URL appFileName) {
        this.appFileName = appFileName;
    }



}*/
