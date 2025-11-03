module BrickShipper {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	
	opens BrickShipper to javafx.base, javafx.graphics, javafx.fxml;
	exports BrickShipper;
}
