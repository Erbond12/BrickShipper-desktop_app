package BrickShipper;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomePageController implements SubViewRequestHandler{

    @FXML Button primaryButton;

    private ThrowingConsumer<String> secondaryButton;

    
	@FXML
    private void switchToSecondary() throws IOException {
		
		if (secondaryButton != null) {
		
			try {
				secondaryButton.accept("secondary");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
    }
	
	public void setOnViewSwitch(ThrowingConsumer<String> consumer) {
		this.secondaryButton = consumer;
	}
}