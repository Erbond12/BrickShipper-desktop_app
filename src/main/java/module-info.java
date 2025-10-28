module BrickShipper {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.sql;
	
	opens BrickShipper to javafx.base, javafx.graphics;
	exports BrickShipper;
}
