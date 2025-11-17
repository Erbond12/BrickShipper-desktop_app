package BrickShipper;

import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HomePageController implements SubViewRequestHandler{

    @FXML private TableView<TableRowDataDummy> tableView;
    @FXML private TableColumn<TableRowDataDummy, String> nameCol;
    @FXML private TableColumn<TableRowDataDummy, String> ageCol;
    @FXML private TableColumn<TableRowDataDummy, String> weightCol;

    @FXML private Button primaryButton;
    private ThrowingConsumer<String> secondaryButton;

    
    // Load table:
    public void initialize() {
    	List<TableRowDataDummy> content = List.of(new TableRowDataDummy("John", 24, 75), new TableRowDataDummy("Smith", 12, 22));
		ObservableList<TableRowDataDummy> contentTeam = FXCollections.observableArrayList(content);
		
		tableView.setItems(contentTeam);

		nameCol.setCellValueFactory(new PropertyValueFactory<>(content.get(0).nameProperty().getName()));
		ageCol.setCellValueFactory(new PropertyValueFactory<>(content.get(0).ageProperty().getName()));
		weightCol.setCellValueFactory(new PropertyValueFactory<>(content.get(0).weightProperty().getName()));
		
		tableView.getColumns().setAll(nameCol, ageCol, weightCol);
    }
    
    
    
    // Handle view switch to next page:
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