import javafx.scene.Parent;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConfigReader {

    private static final String GUI_APP = "guiApp";
    private String mainClass;
    private String jarPath;

    public ConfigReader() throws Exception {
       File file = new File(this.getClass().getResource("/TestNG_config.xml").toURI());
        try {
            getConfig(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getConfig(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        document.getDocumentElement().normalize();
        Element root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node item = nodeList.item(i);
            if (item instanceof Element) {
                switch (item.getNodeName()) {
                    case GUI_APP:
                        this.jarPath = System.getProperty("user.dir") + "/" + ((Element) item).getElementsByTagName("jarPath").item(0)
                                .getAttributes().getNamedItem("value").getNodeValue();
                        this.mainClass = ((Element) item).getElementsByTagName("mainClass").item(0)
                                .getAttributes().getNamedItem("value").getNodeValue();
                        System.out.println(mainClass + jarPath);
                        break;
                }
            }
        }
    }

    public String getJarPath() {
        return jarPath;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void launch() {
        String mainClass = getMainClass();
        String jarPath = getJarPath();
    }

    public static void main(String[] args) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
