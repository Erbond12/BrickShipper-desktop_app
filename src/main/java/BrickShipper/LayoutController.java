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
		
		setContent("secondary");
		
		// Register the content-switch action in the header controller, to trigger the switch in the layout if, the button is clicked
		headerController.setOnViewSwitch( (String fxmlPath) -> setContent(fxmlPath) );
		
	}

    private void setContent(String fxmlFileName) throws IOException{
    	// load new content
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/" + fxmlFileName + ".fxml"));
    	Parent content = fxmlLoader.load();
        centerContent.getChildren().setAll(content);
        
        // inject/ register setContent action
        SubViewRequestHandler homePageController = fxmlLoader.getController();
        homePageController.setOnViewSwitch( (String fxmlPath) -> setContent(fxmlPath) );
    }
}
