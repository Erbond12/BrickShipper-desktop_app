package BrickShipper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class AppFXML extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	// load initial fxml ui
    	Parent root = loadFXML("layout");
        scene = new Scene(root, 640, 480);
        
        // set css styling
        String css = getCSS("/css/dummy.css");
        scene.getStylesheets().add(css);
        
        // set scene
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppFXML.class.getResource("/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    private String getCSS(String url) {
    	return this.getClass().getResource(url).toExternalForm();
    }

    // public static void main(String[] args) {
    //     launch();
    // }

}