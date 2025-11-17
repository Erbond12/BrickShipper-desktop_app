package BrickShipper;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class HeaderController implements SubViewRequestHandler{
	
	@FXML
	private Button homeButton;
	
	@FXML
	private BorderPane headerPane;
	
	// Saves logic that should be run by the layout controller, if home button is pressed
	private ThrowingConsumer<String> homeButtonConsumer;
	
	
	public void initialize() {
		String cssFileName = FilePathsEnum.HEADER_CSS.getPath();
		String url = this.getClass().getResource(cssFileName).toExternalForm();
		headerPane.getStylesheets().add(url);
	}
	
	@FXML
	private void onHomeButtonClick() {
		
		if (homeButtonConsumer != null) {
			try {
				homeButtonConsumer.accept(FilePathsEnum.HOMEPAGE.getPath());;							
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void setOnViewSwitch(ThrowingConsumer<String> homeButtonConsumer) {
		this.homeButtonConsumer = homeButtonConsumer;
	}

}