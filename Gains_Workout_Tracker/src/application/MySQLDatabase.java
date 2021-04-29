package application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import application.Models.CardioTraining;
import application.Models.Database;
import application.Models.WeightTraining;

public class MySQLDatabase implements Database {
	private String host;
	private String database;
	private String dbUsername;
	private String password;
	
	/* Initializes database variables */
	MySQLDatabase(String host, String database, String username, String password){
		this.host = host;
		this.database = database;
		this.dbUsername = username;
		this.password = password;
	}

	@Override
	public Connection connectDatabase() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + database, dbUsername, password);
		if (connection == null)
		{
			System.out.println("Unable to connect to database!");
		}
		return connection;
	}

	@Override
	public void closeDatabase() {
		// TODO: Might want to remove since it serves no purpose here
		System.out.println("Closing connection to " + this.host + " MySQL database...");
	}

	@Override
	public void sqlExceptionError(SQLException e) {
		System.err.format("SQL State: %s\n%s\n", e.getSQLState(), e.getMessage());
	}
	
	/**
	 * Queries database and returns results as ArrayList
	 * @param sql statement String
	 * @return ArrayList of all items in database table
	 */
	public ArrayList<WeightTraining> queryWeightTable(String sql) {
		ArrayList<WeightTraining>weightExercises = new ArrayList<WeightTraining>();
		try (Connection connection = connectDatabase()) {
			Statement statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String username = result.getString("username");
				String workoutName = result.getString("workoutName");
				String difficulty = result.getString("difficulty");
				String avgSetDuration = result.getString("duration");
				Date date = result.getDate("workoutDate");
				int weight = result.getInt("weight");
				int sets = result.getInt("sets");
				int reps = result.getInt("reps");
				WeightTraining newExercise = new WeightTraining(
						id, username, workoutName, difficulty, avgSetDuration, date, weight, sets, reps);
				weightExercises.add(newExercise);
			}
		} catch (SQLException e) {
			sqlExceptionError(e);
		}
		return weightExercises;
	}
	
	/**
	 * Queries database and returns results as ArrayList
	 * @param sql statement String
	 * @return ArrayList of all items in database table
	 */
	public ArrayList<CardioTraining> queryCardioTable(String sql) {
		ArrayList<CardioTraining>cardioExercises = new ArrayList<CardioTraining>();
		try (Connection connection = connectDatabase()) {
			Statement statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				int id = result.getInt("id");
				String username = result.getString("username");
				String workoutName = result.getString("workoutName");
				String difficulty = result.getString("difficulty");
				String avgSetDuration = result.getString("duration");
				Date date = result.getDate("workoutDate");
				CardioTraining newExercise = new CardioTraining(
						id, username, workoutName, difficulty, avgSetDuration, date);
				cardioExercises.add(newExercise);
			}
		} catch (SQLException e) {
			sqlExceptionError(e);
		}
		return cardioExercises;
	}
}
