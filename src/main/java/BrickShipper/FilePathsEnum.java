package BrickShipper;

public enum FilePathsEnum {
	// FXML paths:
	HOMEPAGE("homepage"),
	HEADER(""),
	
	// CSS paths:
	HEADER_CSS("/css/header.css"),
	HOMEPAGE_CSS("");
	
	
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
