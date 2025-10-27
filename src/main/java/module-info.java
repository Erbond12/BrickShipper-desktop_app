module BrickShipper {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens BrickShipper to javafx.base, javafx.graphics;
	exports BrickShipper;
}
