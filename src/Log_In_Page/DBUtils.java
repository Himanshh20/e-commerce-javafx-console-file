package Log_In_Page;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	private static Connection connection;
	private static Statement statement;

	static { 
		try {
			connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/ course_table", "root", "Sia@0120");
			statement = (Statement) connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet executeSelectQuery(String query) throws SQLException { // Select query
		ResultSet result = ((java.sql.Statement) statement).executeQuery(query);

		return result;
	}

	public static void executeQuery(String query) throws Exception { // Insert, Update, Delete, Create, Drop, //
																		// truncate
		statement.execute();
	}

}






