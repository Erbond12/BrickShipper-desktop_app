package BrickShipper;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Repository {
	private Connection conn; 
	
	
	public Repository(String repoName) {
//		
//		String jdbc_url = "jdbc:sqlite:" + repoName;
		
//		try {
//			conn = DriverManager.getConnection(jdbc_url);
//		} catch(SQLException e) {
//			System.out.println(e);
//		}
		
		
		
		// have the jdbc url as an extra variable
		// does the path to the database file have to be absolute? or can it be relative?		
		
		System.out.println(System.getProperty("user.dir"));
		new File("data").mkdirs(); //TODO: Check prior if the folder exists and create it only if not. (Try catch?)
		
		String path = System.getProperty("user.dir") + "/data/" + repoName;
		try (Connection conn  = DriverManager.getConnection("jdbc:sqlite:" + path)) {
            if (conn != null) {
                System.out.println("Connected to SQLite!");

                Statement stmt = conn.createStatement();

                // Create a table
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)");

                // Insert some rows
                stmt.executeUpdate("INSERT INTO users (name, age) VALUES ('Alice', 30)");
                stmt.executeUpdate("INSERT INTO users (name, age) VALUES ('Bob', 25)");

                // Query and print them
                ResultSet rs = stmt.executeQuery("SELECT * FROM users");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("age"));
                }

                rs.close();
                stmt.close();
            }
			
		} catch (SQLException e) {
    		System.out.println(e);
			
		}
	}
	
	// getAllUsers ...
}
