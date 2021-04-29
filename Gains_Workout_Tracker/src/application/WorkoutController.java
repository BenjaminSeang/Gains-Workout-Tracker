package application;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import application.Models.CardioTraining;
import application.Models.WeightTraining;

public class WorkoutController {
	private String host = "cs151-gains-db.cjsjim1qtdlq.us-west-2.rds.amazonaws.com/";
	private String dbName = "gains";
	private String dbUsername = "root";
	private String dbPassword = "Leanahtan523509";
	private MySQLDatabase database;
	
	
	WorkoutController(){}
	
	/** Connects to database */
	private void ConnectToDatabase() {
		database = new MySQLDatabase(host, dbName, dbUsername, dbPassword);
	}
	
	/**
	 * Grabs all weight exercises from table in descending order by date
	 * @return ArrayList of weight exercises
	 */
	public ArrayList<WeightTraining> getAllWeightWorkouts(String username) {
		String dbTable = "weight";
		System.out.println("Fetching data from " + dbTable +" table...");
		String sql = "SELECT * FROM " + dbTable + " WHERE username = '" + username + "' ORDER BY workoutDate DESC";
		ConnectToDatabase();
		ArrayList<WeightTraining>weightExercises = database.queryWeightTable(sql);
		return weightExercises;
	}
	
	/**
	 * Grabs all cardio exercises from table in descending order by date
	 * @return ArrayList of cardio exercises
	 */
	public ArrayList<CardioTraining> getAllCardioWorkouts(String username) {
		String dbTable = "cardio";
		System.out.println("Fetching data from " + dbTable +" table...");
		String sql = "SELECT * FROM " + dbTable + " WHERE username = '" + username + "' ORDER BY workoutDate DESC";
		ConnectToDatabase();
		ArrayList<CardioTraining>cardioExercises = database.queryCardioTable(sql);
		return cardioExercises;
	}
	
	/**
	 * Adds new weight exercise entry to database table
	 * @param exercise WeightTraining object
	 */
	public void addWeightExercise(WeightTraining exercise) {
		String dbTable = "weight";
		System.out.print("Adding weights exercise to database... ");
		String sql = "INSERT INTO " + dbTable + " (username, workoutName, difficulty, duration, workoutDate, weight, sets, reps) VALUES (?,?,?,?,?,?,?,?)";
		ConnectToDatabase();
		try (PreparedStatement statement = database.connectDatabase().prepareStatement(sql)) {
			statement.setString(1, exercise.getUsername());
			statement.setString(2, exercise.getWorkoutName());
			statement.setString(3, exercise.getDifficulty());
			statement.setString(4, exercise.getDuration());
			statement.setDate(5, exercise.getWorkoutDate());
			statement.setInt(6, exercise.getWeight());
			statement.setInt(7, exercise.getSets());
			statement.setInt(8, exercise.getReps());
			statement.executeUpdate();
		} catch (SQLException e) {
			database.sqlExceptionError(e);
		}
		System.out.println("Success!");
	}
	
	/**
	 * Adds new cardio exercise entry to database table
	 * @param exercise CardioTraining object
	 */
	public void addCardioExercise(CardioTraining exercise) {
		String dbTable = "cardio";
		System.out.print("Adding cardio exercise to database... ");
		String sql = "INSERT INTO " + dbTable + " (username, workoutName, difficulty, duration, workoutDate) VALUES (?,?,?,?,?)";
		ConnectToDatabase();
		try (PreparedStatement statement = database.connectDatabase().prepareStatement(sql)) {
			statement.setString(1, exercise.getUsername());
			statement.setString(2, exercise.getWorkoutName());
			statement.setString(3, exercise.getDifficulty());
			statement.setString(4, exercise.getDuration());
			statement.setDate(5, exercise.getWorkoutDate());
			statement.executeUpdate();
		} catch (SQLException e) {
			database.sqlExceptionError(e);
		}
		System.out.println("Success!");
	}
}
