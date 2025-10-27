package BrickShipper;

import java.util.List;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * JavaFX App
 */
public class App extends Application {
	public String buttonText;
	public int counter;

    @Override
    public void start(Stage primaryStage) {
    	try {	
			//Button
			buttonText = "Click Me";
			Button button = new Button(buttonText);
			counter = 0;
			
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					counter++;
					button.setText("You clicked me? counter: " + counter);
					event.consume();
				}
			});
			
			// Table
			List<TableRowDataDummy> content = List.of(new TableRowDataDummy("John", 24, 75), new TableRowDataDummy("Smith", 12, 22));
			ObservableList<TableRowDataDummy> contentTeam = FXCollections.observableArrayList(content);
			TableView<TableRowDataDummy> table = new TableView<>(contentTeam);
			//table.setItems(contentTeam);
			TableColumn<TableRowDataDummy, String> nameCol = new TableColumn<>("Name");
			nameCol.setCellValueFactory(new PropertyValueFactory<>(content.get(0).nameProperty().getName()));
			TableColumn<TableRowDataDummy, String> ageCol = new TableColumn<>("Age");
			ageCol.setCellValueFactory(new PropertyValueFactory<>(content.get(0).ageProperty().getName()));
			TableColumn<TableRowDataDummy, String> weightCol = new TableColumn<>("Weight");
			weightCol.setCellValueFactory(new PropertyValueFactory<>(content.get(0).weightProperty().getName()));
			
			table.getColumns().setAll(nameCol, ageCol, weightCol);
			
			// Layout tests
			Label textToDisplay0 = new Label("Hello World from JavaFX");
			Label textToDisplay1 = new Label("Hello World from JavaFX");
			Label textToDisplay2 = new Label("Hello World from JavaFX");
			textToDisplay2.setTextFill(Color.WHITE);
			StackPane hbox = new StackPane();
			hbox.getChildren().addAll(new Rectangle(100,100,Color.BLUE), textToDisplay2);
			BorderPane root = new BorderPane(table);
			
			
			// Scenes
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("/css/dummy.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
    	catch(Exception e) {
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
        launch();
    }

}