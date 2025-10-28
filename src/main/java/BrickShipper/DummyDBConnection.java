package BrickShipper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DummyDBConnection {
	
	public static void main(String[] args) {
		System.out.println("hello World");
		try (Connection conn  = DriverManager.getConnection("jdbc:sqlite:/Users/erikos/eclipse-configs/test_db/test.db:'")) {
            if (conn != null) {
        		System.out.println("hello Conn");
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

        		System.out.println("ciao conn");
            }
    		System.out.println("no conn");
			
		} catch (SQLException e) {
    		System.out.println(e);
			
		}
		System.out.println("none");
	}

}
