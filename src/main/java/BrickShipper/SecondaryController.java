package BrickShipper;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController implements SubViewRequestHandler{
	
	private ThrowingConsumer<String> switchViewListener;
	

    @FXML
    private void switchToPrimary() throws IOException {
    	
    	if (switchViewListener != null) {
    	
	        try {
				switchViewListener.accept(FilePathsEnum.HOMEPAGE.getPath());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    public void setOnViewSwitch(ThrowingConsumer<String> throwingConsumer) {
    	this.switchViewListener = throwingConsumer;
    }
}