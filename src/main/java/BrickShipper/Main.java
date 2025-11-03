package BrickShipper;

import javafx.application.Application;

public class Main {
	public static void main(String[] args) {
		
		// Init DB
		String repoName = "test.db";
		Repository repo = new Repository(repoName);
		
		// Init Service (Controller?)
		Service service = new Service(repo);
		
		// Make Service Global
		AppContext.init(service);
		
		// Start the UI
		Application.launch(App.class, args);
		
	}
}
