package BrickShipper;

public enum FilePathsEnum {
	// FXML paths:
	HOMEPAGE("homepage"),
	HEADER("header"),
	LAYOUT("layout"),
	
	// CSS paths:
	HEADER_CSS("/css/header.css"),
	HOMEPAGE_CSS(""),
	
	// Controller Paths:
	HOMEPAGE_CONTROLLER("HomePageController"),
	HEADER_CONTROLLER("HeaderController"),
	LAYOUT_CONTROLLER("LayoutController");
	
	
	
	
	private final String path;
	
	FilePathsEnum(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		return this.path;
	}

	public String getPath() {
		return this.path;
	}
}
