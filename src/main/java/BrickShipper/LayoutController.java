package BrickShipper;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;

public class LayoutController {
	
    @FXML
	private Group centerContent;

	public void initialize() throws IOException  {
		setContent("secondary");
	}

    private void setContent(String fxmlFileName) throws IOException {
    	Parent content = FXMLLoader.load(getClass().getResource("/" + fxmlFileName + ".fxml"));
        centerContent.getChildren().setAll(content);
    }

	
    @FXML
    private void switchToSecondary() throws IOException {
//    	AppFXML.setRoot("secondary");
    	setContent("primary");
    }
}
