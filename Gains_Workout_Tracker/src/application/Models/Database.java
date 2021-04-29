package application.Models;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
	/**
	 * Establishes initial database connection.
	 * @return Database connection
	 * @throws SQLException
	 */
	public Connection connectDatabase() throws SQLException;
	/**
	 * Closes the database connection.
	 */
	public void closeDatabase();
	/**
	 * SQL Exception handler helper
	 * @param e SQL Exception
	 */
	public void sqlExceptionError(SQLException e);
}
