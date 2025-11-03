package BrickShipper;

import javafx.application.Application;

public class Main {
	public static void main(String[] args) {
		
		String repoName = "test.db";
		Repository repo = new Repository(repoName);
		
		Service service = new Service(repo);
		
		AppContext.init(service);
		
		Application.launch(App.class, args);
		
	}
}
