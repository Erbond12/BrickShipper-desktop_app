package BrickShipper;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HeaderController {
	
	@FXML
	private Button homeButton;
	
	private Runnable homeButtonListener;
	
	@FXML
	private void onHomeButtonClick() {
		System.out.println("hello world");
		
		if (homeButtonListener != null) {
			homeButtonListener.run();;			
		}
	}
	
	public void setHomeButtonListener(Runnable homeButtonListener) throws IOException {
		this.homeButtonListener = homeButtonListener;
	}

}
