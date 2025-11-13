package BrickShipper;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;

public class LayoutController {
	
	// Set the name of the controller like this: <fx:id> + "Controller". Here the fx:id is header. It is case-sensitiv
	@FXML
	private HeaderController headerController;

	@FXML
	private Group centerContent;
    

	public void initialize() throws IOException  {
		// maybe switch to observabel BooleanProperty or ObjectProperty<Event>? -> on try catch 
		// This registers the action in the header controller, so that on click the center content switch can be triggered within the layout.
		headerController.setHomeButtonListener( () -> {
			try {
				setContent("primary");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
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
